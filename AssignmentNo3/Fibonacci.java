/*output
Enter number of terms of series : 20
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
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
/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 .....*/ 
    import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number;  // To hold number of terms

        int firstTerm = 0,
            secondTerm = 1,
            thirdTerm;
 
        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
 
        System.out.print(firstTerm + " " + secondTerm + " ");
 
        for(int i = 3; i <= number; i++)
	{
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
	}
    }  
}