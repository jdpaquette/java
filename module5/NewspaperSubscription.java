//Farrell - Java Programming - Chapter 11 - Problem 3a
// Advanced Inheritance Concepts
//created / revised by Joe Paquette Sept. 22nd 2019

public abstract class NewspaperSubscription
{
   protected String subName;
   protected String subAddress;
   protected double subRate;
   public String getName()
   {
      return subName;
   }
   public void setName(String name)
   {
      subName = name;
   }
   public String getAddress()
   {
      return subAddress;
   }
   public double getRate()
   {
      return subRate;
   }
   public abstract void setAddress(String s);
}