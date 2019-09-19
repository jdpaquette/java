//Farrell - Java Programming - Chapter 10 - Problem 4a
// Intro to Inheritance
//created / revised by Joe Paquette Sept. 18th 2019

public class Poem
{
    private String poemTitle;
    private int poemLines;
    public Poem(String title, int numberLines)
    {
        poemTitle = title;
        poemLines = numberLines;
    }
    public String getTitle()
    {
        return poemTitle;
    }
    public int getLines()
    {
        return poemLines;
    }
}