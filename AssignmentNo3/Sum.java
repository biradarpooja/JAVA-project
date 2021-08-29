/*output
Enter the first number 23
Enter the second number 45
Sum of numbers: 68
Do you want to continue y/n? y

Enter the first number 34
Enter the second number 65
Sum of numbers: 99
Do you want to continue y/n? y

Enter the first number 23
Enter the second number 87
Sum of numbers: 110
Do you want to continue y/n? n

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
//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; otherwise it should terminate. 
    import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int number1, number2;
        char choice;
        
        do
        {
            System.out.print("Enter the first number ");
            number1 = console.nextInt();
          
            System.out.print("Enter the second number ");
            number2 = console.nextInt();
            
            int sum = number1 + number2;
            System.out.println("Sum of numbers: " + sum);
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
            System.out.println();
            
        }while(choice=='y' || choice == 'Y');
    }  
}