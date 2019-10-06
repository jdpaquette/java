//Farrell - Java Programming - Chapter 14 - Problem 3
// Intro to Swing Components
//created / revised by Joe Paquette Oct. 6th, 2019

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFacts extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Click for Next Fact");
    JLabel stars = new JLabel("**********************************************");
    JLabel f1 = new JLabel("Turkeys were once worshipped like gods.         ");
    JLabel f2 = new JLabel("Paul Revere never actually shouted, 'The British are coming'.      ");
    JLabel f3 = new JLabel("The Olympics used to award medals for art.                  ");
    JLabel f4 = new JLabel("One time, 100 imposters claimed to be Marie Antoinette's dead son.      ");
    JLabel f5 = new JLabel("Napolean was once attacked by a horde of bunnies. ");
    JLabel f6 = new JLabel("Women were once banned from smoking in public.     ");   
    JLabel f7 = new JLabel("The government literally poisoned alcohol during prohibition.     ");   
    JLabel f8 = new JLabel("Captain Morgan actually existed.     ");   
    JLabel f9 = new JLabel("Using forks used to be seen as sacrilegious.     ");   
    int counter = 0;
    public JFacts()
    {
       super("Facts");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(flow);
       add(button);
       add(stars);
       add(f1);
       button.addActionListener(this);
    }
    public static void main(String[] args)
    {
       JFacts rFrame = new JFacts();
       rFrame.setSize(440, 100);
       rFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
       ++counter;
       if(counter == 9)
         counter = 0;
       if(counter == 1)
       {
           remove(f1);
           add(f2);
       }
       else
          if(counter == 2)
          {
              remove(f2);
              add(f3);
          }
          else
              if(counter == 3)
              {
                   remove(f3);
                   add(f4);
              }
              else
                 if(counter == 4)
                 {
                    remove(f4);
                    add(f5);
                 }
                 else
                    if(counter == 5)
                    {
                        remove(f5);
                        add(f6);
                    } 
                    else
                        if(counter == 6)
                        {
                            remove(f6);
                            add(f7);
                        }
                        else
                            if(counter == 7)
                            {
                                remove(f7);
                                add(f8);
                            }
                            else
                                if(counter == 8)
                                {
                                    remove(f8);
                                    add(f9);
                                }                                        
                                else
                                {
                                    remove(f9);
                                    add(f1);
                                }
        validate();
        repaint();
   }
 
 }