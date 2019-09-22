//Farrell - Java Programming - Chapter 11 - Problem 3b
// Advanced Inheritance Concepts
//created / revised by Joe Paquette Sept. 22nd 2019

public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
   public void setAddress(String add)
   {
      boolean hasNumeral = false;
      address = add;
      for(int x = 0; x < add.length(); ++x)
         if(Character.isDigit(add.charAt(x)))
            hasNumeral = true;
      if(hasNumeral)
         subRate = 15.00;
      else
      {
         subRate = 0;
         System.out.print("\nAddress must contain a numeral   ");
      }
   }

}