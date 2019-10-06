//Farrell - Java Programming - Chapter 14 - Problem 7
// Intro to Swing Components
//created / revised by Joe Paquette Oct. 6th, 2019

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JCapitals extends JFrame implements ItemListener
{
    FlowLayout flow = new FlowLayout();
    JLabel countryLabel = new JLabel("Select a country");
    JComboBox<String> countryBox = new JComboBox<String>();
    JTextField capitalField = new JTextField(25);
    String[] countries = {"England", "Ireland", "Scotland", "France", "Italy", "Portugal", "Spain"};
    String[] capitals = {"London", "Dublin", "Edinburgh", "Paris", "Rome", "Lisbon", "Madrid"};
    String countryName;
    String output;
    int countryNumber;
    public JCapitals()
    {
        super("Capitals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        countryBox.addItemListener(this);
        for(int x = 0; x < countries.length; ++x)
            countryBox.addItem(countries[x]);
        add(countryLabel);
        add(countryBox);
        add(capitalField);
    }
    public static void main(String[] arguments)
    {
        JCapitals cframe = new JCapitals();
        cframe.setSize(400, 150);
        cframe.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent list)
    {
        Object source = list.getSource();
        if(source == countryBox)
        {
            countryNumber = countryBox.getSelectedIndex();
            countryName = countries[countryNumber];
            output = "The capital of " + countryName + " is " + capitals[countryNumber];
            capitalField.setText(output);
        }
    }
}