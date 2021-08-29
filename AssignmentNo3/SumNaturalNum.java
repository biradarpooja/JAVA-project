/*output
Sum of First 10 Natural Numbers is = 55
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
//Write a program to calculate the sum of first 10 natural number.
public class SumNaturalNum 
{  
public static void main(String[] args)   
{  
int i, num = 10, sum = 0;  
//executes until the condition returns true  
for(i = 1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
//prints the sum   
System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
}  
}