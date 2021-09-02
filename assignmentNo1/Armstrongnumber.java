/*output
505 is not an Armstrong number.
------------------------------------------------------------------------
BUILD SUCCESS
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
/*java program to check armdtrong number*/
public class Armstrongnumber {
        public static void main(String[] args) {
            int num = 505, originalNum, remainder, result = 0;
            originalNum = num;
            while (originalNum != 0)
            {
                remainder = originalNum % 10;
                result += Math.pow(remainder, 3);
                originalNum /= 10;
            }   
            if(result == num)
                System.out.println(num + " is an Armstrong number.");
            else
                System.out.println(num + " is not an Armstrong number.");
        }
    }
