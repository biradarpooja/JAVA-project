/*output
Sum of First 201 Natural Numbers is = 20301
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
//Java program to Find Sum of Natural Numbers using Recursion
public class NaturalNum 
{  
public static void main(String[] args)   
{  
int num = 201, i = 1, sum = 0;  
//executes until the condition returns true  
while(i <= num)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
//increments the value of i by 1  
i++;  
}  
//prints the sum   
System.out.println("Sum of First 201 Natural Numbers is = " + sum);  
}  
}  
