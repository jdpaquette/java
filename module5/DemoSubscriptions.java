//Farrell - Java Programming - Chapter 11 - Problem 3d
// Advanced Inheritance Concepts
//created / revised by Joe Paquette Sept. 22nd 2019

public class DemoSubscriptions
{
   public static void main(String args[])
   {
      PhysicalNewspaperSubscription phsubGood = new PhysicalNewspaperSubscription();
      OnlineNewspaperSubscription olsubGood = new OnlineNewspaperSubscription();
      PhysicalNewspaperSubscription phsubBad = new PhysicalNewspaperSubscription();
      OnlineNewspaperSubscription olsubBad = new OnlineNewspaperSubscription();
      phsubGood.setSubName("Freddy Cruegar");
      phsubGood.setSubAddress("123 Elm St");
      display(phsubGood);
      phsubBad.setSubName("Mary Poppins");
      phsubBad.setSubAddress("17 Cherry Tree Lane");
      display(phsubBad);      
      olsubGood.setSubName("Donald Duck");
      olsubGood.setSubAddress("donald.duck@waltdisney.com");
      display(olsubGood);
      olsubBad.setSubName("Mickey Mouse");
      olsubBad.setSubAddress("mickey.mouse@waltdisney.co,");
      display(olsubBad); 
   }
   public static void display(NewspaperSubscription name)
   {
      System.out.println("Name: " + name.getSubName() + "   Address: " +
         name.getSubAddress() + "   Rate: " + name.getSubRate() + "\n");
   }
}