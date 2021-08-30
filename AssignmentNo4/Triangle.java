/*output
11.61895003862225
9.0
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
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

public class Triangle {
  int a,b,c;
  public double getArea(){
    double s = (a+b+c)/2.0;
    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
  }
  public double getPerimeter(){
    return (a+b+c)/2.0;
  }
}

class Ans{
  public static void main(String[] args){
    Triangle t = new Triangle();
    t.a = 4;
    t.b = 8;
    t.c = 6;
    System.out.println(t.getArea());
    System.out.println(t.getPerimeter());
  }
}							