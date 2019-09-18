//Farrell - Java Programming - Chapter 10 - Problem 3b
// Intro to Inheritance
//created / revised by Joe Paquette Sept. 18th 2019

public class CustomTee extends TeeShirt
{
    private String shirtSlogan;
    public void setSlogan(String slogan)
    {
        shirtSlogan = slogan;
    }
    public String getSlogan()
    {
        return shirtSlogan;
    }
}