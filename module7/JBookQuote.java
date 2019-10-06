//Farrell - Java Programming - Chapter 14 - Problem 1
// Intro to Swing Components
//created / revised by Joe Paquette Oct. 6th, 2019

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote extends JFrame
{
   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("You don't have to live forever,");
   JLabel msg2 = new JLabel("you just have to live.");
   public JBookQuote()
   {
      super("Book Quote");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(msg1); 
      add(msg2);
   }
   public static void main(String[] args)
   {
     JBookQuote aFrame = new JBookQuote();
     aFrame.setSize(300, 150);
     aFrame.setVisible(true);
   }
}