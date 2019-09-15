//Farrell - Java Programming - Chapter 9 - Problem 6
// Advanced Array Topics
//created / revised by Joe Paquette Sept. 15th 2019

import javax.swing.*;
class TimesAndInstructors
{
    public static void main(String[] args) 
    {
        course[0][0] = "COM-140";
        course[0][1] = "TR 9:30am";
        course[0][2] = "McGinnis";
        course[1][0] = "COM-140";
        course[1][1] = "MWF 8:30am";
        course[1][2] = "Adams";
        course[2][0] = "COM-207";
        course[2][1] = "MWF 11:30am";
        course[2][2] = "Reagan";
        course[3][0] = "COM-207";
        course[3][1] = "TR 11:00am";
        course[3][2] = "Banisakher";
        course[4][0] = "COM-209";
        course[4][1] = "TR 2:00pm";
        course[4][2] = "Banisakher";
        course[5][0] = "COM-302";
        course[5][1] = "MWF 11:30am";
        course[5][2] = "Adams";
        course[6][0] = "COM-327";
        course[6][1] = "MWF 9:30am";
        course[6][2] = "Bal";
        course[7][0] = "COM-330";
        course[7][1] = "TR 8:00am";
        course[7][2] = "Omar";
        course[8][0] = "COM-340";
        course[8][1] = "MWF 1:30pm";
        course[8][2] = "Reagan";
        course[9][0] = "COM-405";
        course[9][1] = "MWF 2:30pm";
        course[9][2] = "Kirshnan";

        String crsEntry,  message ="Enter a course:";
        int number, x;
        boolean onList = false;
        while (!onList)
        {
           entry = JOptionPane.showInputDialog(null, message);
           for(x = 0; x < course.length; ++ x)
              if(crsEntry.equals(course[x][0]))
              {
                 onList = true;
                 JOptionPane.showMessageDialog(null,
                    "Course: " + crsEntry + " Time: " + course[x][1] +
                    " Professor: " + course[x][2]);
              }
           if(!onList)
              JOptionPane.showMessageDialog(null, "That course is not on the list");
        }
      
    }  
}