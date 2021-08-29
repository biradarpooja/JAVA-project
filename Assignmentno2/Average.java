/*
The average is: 30.36
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biradar bharat
 */
//Java Program to Calculate Average of Numbers Using Arrays
public class Average {

    public static void main(String[] args) {
        double[] numArray = { 85.3, 19.5, -45.6, 45.34, 2.0, 75.6 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }  
}
