//Farrell - Java Programming - Chapter 11 - Problem 3c
// Advanced Inheritance Concepts
//created / revised by Joe Paquette Sept. 22nd 2019

public class OnlineNewspaperSubscription extends NewspaperSubscription
{
   public void setSubAddress(String add)
   {
      boolean hasSymbol = false;
      subAddress = add;
      for(int x = 0; x < add.length(); ++x)
         if(add.charSymbol(x) == '@')
            hasSymbol = true;
      if(hasSymbol)
         subRate = 9.00;
      else
      {
         subRate = 0;
         System.out.print("\nAddress must contain an 'at'(@)-symbol   ");
      }
   }

}
