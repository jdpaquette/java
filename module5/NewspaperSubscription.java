//Farrell - Java Programming - Chapter 11 - Problem 3a
// Advanced Inheritance Concepts
//created / revised by Joe Paquette Sept. 22nd 2019

public abstract class NewspaperSubscription
{
   protected String subName;
   protected String subAddress;
   protected double subRate;
   public String getSubName()
   {
      return subName;
   }
   public void setSubName(String name)
   {
      subName = name;
   }
   public String getSubAddress()
   {
      return subAddress;
   }
   public double getRate()
   {
      return subRate;
   }
   public abstract void setSubAddress(String s);
}