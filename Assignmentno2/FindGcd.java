/*
GCD of 200 and 160 is: 40
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
//Java Program to Find G.C.D Using Recursion
public class FindGcd    
{  
public static void main(String[] args)   
{  
//x and y are the numbers to find the GCF  
int x = 200, y = 160, gcd = 1;  
//running loop form 1 to the smallest of both numbers  
for(int i = 1; i <= x && i <= y; i++)  
{  
//returns true if both conditions are satisfied   
if(x%i==0 && y%i==0)  
//storing the variable i in the variable gcd  
gcd = i;  
}  
//prints the gcd  
System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
}  
}  
