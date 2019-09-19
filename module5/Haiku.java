//Farrell - Java Programming - Chapter 10 - Problem 4c
// Intro to Inheritance
//created / revised by Joe Paquette Sept. 18th 2019

public class Haiku extends Poem
{
   private String poemTitle;
   private int poemLines;
   public Haiku(String title)
   {
      super(title, 3);
   }
}