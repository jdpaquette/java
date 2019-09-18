//Farrell - Java Programming - Chapter 10 - Problem 3c
// Intro to Inheritance
//created / revised by Joe Paquette Sept. 18th 2019

import java.util.*;
public class DemoTees
{
    public static void main(String[] args) 
    {
        TeeShirt shirt1 = new TeeShirt();
        TeeShirt shirt2 = new TeeShirt();
        TeeShirt shirt3 = new TeeShirt();
        TeeShirt shirt4 = new TeeShirt();
        CustomTee shirt5 = new CustomTee();
        CustomTee shirt6 = new CustomTee();
        CustomTee shirt7 = new CustomTee();
        CustomTee shirt8 = new CustomTee();
        shirt1.setOrderNumber(1001);
        shirt1.setSize("XS");
        shirt1.setColor("blue");
        shirt2.setOrderNumber(1002);
        shirt2.setSize("SM");
        shirt2.setColor("orange");
        shirt3.setOrderNumber(1003);
        shirt3.setSize("LG");
        shirt3.setColor("red");
        shirt4.setOrderNumber(1004);
        shirt4.setSize("XL");
        shirt4.setColor("grey");
        shirt5.setOrderNumber(1005);
        shirt5.setSize("XXL");
        shirt5.setColor("heather");
        shirt5.setSlogan("#Gator Nation");
        shirt6.setOrderNumber(1006);
        shirt6.setSize("XXXL");
        shirt6.setColor("forest");
        shirt6.setSlogan("UFL FTW");
        shirt7.setOrderNumber(1007);
        shirt7.setSize("LGT");
        shirt7.setColor("skye");
        shirt7.setSlogan("Swamp Life");
        shirt8.setOrderNumber(1008);
        shirt8.setSize("XLT");
        shirt8.setColor("brown");
        shirt8.setSlogan("Welcome to the Swamp");
        display(shirt1);
        display(shirt2);
        display(shirt3);
        display(shirt4);
        displayCustomData(shirt5);
        displayCustomData(shirt6);
        displayCustomData(shirt7);
        displayCustomData(shirt8);
    }
    public static void display(TeeShirt shirt)
    {
        System.out.println("Order #" + shirt.getOrderNumber());
        System.out.println("     Description: " + shirt.getSize() + 
            " " + shirt.getColor());
        System.out.println("     Price: $" + shirt.getPrice());
    }
    public static void displayCustomData(CustomTee shirt)
    {
        display(shirt);
        System.out.println("     Slogan: " + shirt.getSlogan());
    }    
}