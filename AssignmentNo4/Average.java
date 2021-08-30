/*output
average of  (10,20,60,80,90)  is =52 
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
//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
public class Average {
  public static void main(String arg[])
  {
    int n=5,avg=0;
 
    int a[]=new int[n];
 
    a[0]=10;
 
    a[1]=20;
 
    a[2]=60;
 
    a[3]=80;
 
    a[4]=90;
 
    for(int i=0;i<n;i++)
 
    avg=avg+a[i];
 
    System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")  is ="+ avg/n);
 
  }
}