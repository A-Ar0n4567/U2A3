/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myownaverage.calculator;
import java.util.Scanner;
/**
 *
 * @author aamir7110
 */
public class MyOwnAverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        //variable Assignment
        double total,average;
        
        total=0;
        
        double[] marks = new double[5];
        
        //get the 5 marks from user
        System.out.println("Enter In Your Five marks:");
        for(int i=0; i<=4 ;i=i+1 ){
            marks[i] = keyedInput.nextDouble();
        }
        //add all the marks together
        for(int i=0; i<=4; i=i+1){
            total = total+marks[i];    
        }
        //do all the math for an average
        average = total/5;
        average = average*10;
        average = Math.round(average);
        average = average/10;
        
        System.out.println("Your Average is: "+average+"%");
        
    }
    
}
