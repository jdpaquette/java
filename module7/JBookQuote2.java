//Farrell - Java Programming - Chapter 14 - Problem 1b
// Intro to Swing Components
//created / revised by Joe Paquette Oct. 6th, 2019

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote2 extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("You don't have to live forever,");
   JLabel msg2 = new JLabel("you just have to live.");
   JButton button = new JButton("Click for book source");
   JLabel msg3 = new JLabel("**    Tuck Everlasting by Natalie Babbitt    **");
   public JBookQuote2()
   {
      super("Book Quote 2");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(msg1); 
      add(msg2);
      add(button);
      button.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      add(msg3);
      validate();
      repaint();
   }
   public static void main(String[] args)
   {
     JBookQuote2 aFrame = new JBookQuote2();
     aFrame.setSize(260, 150);
     aFrame.setVisible(true);
   }
}