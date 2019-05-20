//Farrell - Java Programming - Chapter 6 - Problem 3 
//created / revised by Joe Paquette May 2019

public class Factorials
{
   public static void main (String args[])
   {
// assign facotrial variable and perform some math
    final int MAX = 10;
      int factorial;
      for (int i = 1; i <= MAX; i++)
      {
         factorial = i;
         for(int j = i - 1; j > 0; --j)
             factorial = factorial * j;
         System.out.println("The factorial of " + i +
           " is " + factorial);
      }
   }
}


