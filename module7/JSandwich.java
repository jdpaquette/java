//Farrell - Java Programming - Chapter 14 - Problem 6
// Intro to Swing Components
//created / revised by Joe Paquette Oct. 6th, 2019

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JSandwich extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    JLabel businessName = new JLabel("Sublime Sandwich Shoppe");
    JComboBox<String> meatBox = new JComboBox<String>();
    JLabel meatList = new JLabel("Choice of Meat");
    JComboBox<String> breadBox = new JComboBox<String>();
    JLabel breadList = new JLabel("Choice of Bread");
    JTextField totalPrice = new JTextField(10);
    int mainNumber, breadNumber;
    double[] meatCosts = {8.50, 6.50, 7.50};
    double sumPrice = meatCosts[0];
    double breadPrice = 0;
    double meatCost = meatPrices[0];
    double[] breadPrices = {0, 1, 1.5};
    String output;
    public JSandwich()
    {
       super("Sublime Sandwich Shop");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
       setLayout(flow);
       add(businessName);
       businessName.setFont(new Font("Times", Font.BOLD, 24));
       meatBox.addItem("Roast Beef");
       meatBox.addItem("Ham");
       meatBox.addItem("Turkey");
       breadBox.addItem("White");
       breadBox.addItem("Whole Grain");
       breadBox.addItem("Sourdough");
 
       add(meatList);
       add(meatBox);
       meatBox.addItemListener(this);
       add(breadList);
       add(breadBox);
       breadBox.addItemListener(this);
       output = "Total Price $" + sumPrice;
       totalPrice.setText(output);
       add(totalPrice);
    }
    public static void main(String[] arguments)
    {
       JSandwich sandframe = new JSandwich();
       sandframe.setSize(240,200);
       sandframe.setVisible(true);
    }
 
    @Override
    public void itemStateChanged(ItemEvent list)
    {
        Object source = list.getSource();
        if (source == meatBox)
        {
           mainNumber = meatBox.getSelectedIndex();
           meatCost = meatCosts[mainNumber];
           sumPrice = meatCost + breadPrice;
           output = "Total Price $" + sumPrice;
           totalPrice.setText(output);
        }
        else if (source == breadBox)
        {
           breadNumber = breadBox.getSelectedIndex();
           breadPrice = breadPrices[breadNumber];
           sumPrice = meatCost + breadPrice;
           output = "Total Price $" + sumPrice;
           totalPrice.setText(output);
        }
    }
 }