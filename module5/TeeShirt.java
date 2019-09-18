//Farrell - Java Programming - Chapter 10 - Problem 3
// Intro to Inheritance
//created / revised by Joe Paquette Sept. 18th 2019

public class TeeShirt
{
    private int orderNumber;
    private String shirtSize;
    private double shirtPrice;
    private String color;
    public void setOrderNumber(int number)
    {
        orderNumber = number;
    }
    public void setSize(String size)
    {
        shirtSize = size;
        if(shirtSize == "XXL" || shirtSize == "XXXL")
            shirtPrice = 22.99;
        else
            shirtPrice = 19.99;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public int getOrderNumber()
    {
        return orderNumber;
    }
    public String getSize()
    {
        return shirtSize;
    }
    public String getColor()
    {
        return color;
    }
    public double getPrice()
    {
        return shirtPrice;
    }
}
