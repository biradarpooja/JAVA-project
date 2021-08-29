/*output
429
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
//Java Program to Convert Octal Number to Decimal and vice-versa
public class OctalToDecimal { 
public static void main(String args[]){  
//Declaring an octal number  
String octalString="655";  
//Converting octal number into decimal  
int decimal=Integer.parseInt(octalString,8);  
//Printing converted decimal number  
System.out.println(decimal);  
} 
}
