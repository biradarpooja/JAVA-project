/*
Enter number:25
25 * 1 = 25
25 * 2 = 50
25 * 3 = 75
25 * 4 = 100
25 * 5 = 125
25 * 6 = 150
25 * 7 = 175
25 * 8 = 200
25 * 9 = 225
25 * 10 = 250
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
//Write a program to find the factorial value of any number entered through the keyboard. 

    import java.util.Scanner;
 
public class FactorialNum
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num; 
        int fact = 1; 
 
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
 
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
 
        System.out.println("Factorial: "+ fact);
    }
} 