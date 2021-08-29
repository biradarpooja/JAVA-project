/*output
Factorial of 10 is: 3628800*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biradar bharat
 */
//Java program to Calculate Factorial of a Number Using Recursion
public class FactorialNum {  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=10;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
