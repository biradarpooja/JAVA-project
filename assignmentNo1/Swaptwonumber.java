/*output
Enter the value of X and Y
45
76
before swapping numbers: 45  76
After swapping: 76   45

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
java program to swap two number
*/


package swaptwonumber;

/**
 *
 * @author biradar bharat
 */
 import java.util.*;
public class Swaptwonumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,t;
   
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       /*swapping */  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
    }    
} 
