//Farrell - Java Programming - Chapter 10 - Problem 4b
// Intro to Inheritance
//created / revised by Joe Paquette Sept. 18th 2019

public class Couplet extends Poem
{
    private String poemTitle;
    private int poemLines;
    public Couplet(String title)
    {
        super(title, 2);
    }
}