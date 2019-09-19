//Farrell - Java Programming - Chapter 10 - Problem 4e
// Intro to Inheritance
//created / revised by Joe Paquette Sept. 18th 2019

import java.util.*;
public class DemoPoems
{
   public static void main(String[] args)
   {
      Poem poem1 = new Poem("The Raven", 20);
      Couplet poem2 = new Couplet("Macbeth");
      Limerick poem3 = new Limerick("There once was a man from Nantucket");
      Haiku poem4 = new Haiku("The Old Pond");
      display(poem1);
      display(poem2);
      display(poem3);
      display(poem4);
   }
   public static void display(Poem poem)
   {
      System.out.println("Poem: " + poem.getTitle() +
         "   Lines: " + poem.getLines());
   }
} 
