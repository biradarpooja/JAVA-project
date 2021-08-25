//run:
Size of int: 4 bytes.
Size of char: 2 bytes.
Size of float: 4 bytes.
Size of double: 8 bytes.
BUILD SUCCESSFUL (total time: 0 seconds)
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author biradar bharat
 */
class SizePrimitive
{
 public static void main (String[] args)
 {
  System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
  System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
  System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
  System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
  }
}
