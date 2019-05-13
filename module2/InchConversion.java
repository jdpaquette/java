//Chapter 3 - Exercise 7 - Farrell Java Programming
//created by Joseph Paquette

import java.util.Scanner;
public class InchConversion
{
  public static void main (String args[])
  {
     int inches;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter inches >> ");
     inches = input.nextInt();
     convertToFeet(inches);
     convertToYards(inches);
  }

  public static void convertToFeet(int inches)
  {
     double feet;
     final double INCHES_IN_FT = 12; // inches per foot
     feet = inches / INCHES_IN_FT;
     System.out.println(inches + " inches is " + feet + " feet");
  }
  public static void convertToYards(int inches)
  {
     double yards;
     final double INCHES_IN_YD = 36; // inches per yard
     yards = inches / INCHES_IN_YD;
     System.out.println(inches + " inches is " + yards + " yards");
  }
}
