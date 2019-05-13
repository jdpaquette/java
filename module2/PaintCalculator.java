//Chapter 3 - Exercise 8 - Farrell Java Programming
//created by Joseph Paquette

import java.util.Scanner;
public class PaintCalculator
{
  public static void main (String args[])
  {
     double width, height, length;
     double price;
     Scanner kb = new Scanner(System.in);
     System.out.print("Enter the room's width >> ");
     length = kb.nextDouble();
     System.out.print("Enter the room's height >> ");
     width = kb.nextDouble();
     System.out.print("Enter the room's length >> ");
     height = kb.nextDouble();
     price = computeArea(width, height, length);
     System.out.println("The price to paint the room is $" + price);
   }

   public static double computeArea(double width, double height, double length)
   {
      final double PRICE_GALLON = 32; //cost of paint = $32 per gallon
      double area = length * height * 2 + width * height * 2;
      double gallons;
      double price;
      gallons = computeGallons(area);
      System.out.println("You will need " + gallons + " gallons");
      price = gallons * PRICE_GALLON;
      return price;
   }
   public static double computeGallons(double area)
   {
       final int SQFT_PER_GAL = 350; //coverage of 350 sq ft per gallon
       double gallons = area / SQFT_PER_GAL;
       return gallons;
   }
}