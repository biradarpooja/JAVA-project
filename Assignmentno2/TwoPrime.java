/*
Enter a number: 100
100 can be expressed as the sum of 3 and 97
100 can be expressed as the sum of 11 and 89
100 can be expressed as the sum of 17 and 83
100 can be expressed as the sum of 29 and 71
100 can be expressed as the sum of 41 and 59
100 can be expressed as the sum of 47 and 53
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
/*Java Program to Check Whether a Number can be Express as Sum of Two Prime Numbers*/
    import java.util.*;
public class TwoPrime {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
boolean flag = false;
for (int i = 2; i <= number / 2; ++i) {

if (sum_of_primes(i)) {

if (sum_of_primes(number - i)) {

System.out.printf("%d can be expressed as the sum of %d and %d\n", number, i, number - i);
flag = true;
}

}
}

if (!flag)
System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
}

//function to check if given number is prime or not
static boolean sum_of_primes(int num) {
boolean isPrime = true;

for (int i = 2; i <= num / 2; ++i) {
if (num % i == 0) {
isPrime = false;
break;
}
}

return isPrime;
}
}