/*output
24 raised to power 3 is : 13824
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
//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
public class PowerCalculater {
  public static void main(String[] args) {
    // initialize values
    int power = 3;
    int number = 24;
    int result = 1;
    System.out.print(number +" raised to power " + power +" is : ");
    // loop till power is 0
    while (power > 0) {
      // multiply number by itself
      result = result * number;
      // reduce loop counter
      power--;
    }
    System.out.print(result);
  }
}
