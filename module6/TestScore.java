//Farrell - Java Programming - Chapter 12 - Problem 8b
// Exception Handling
//created / revised by Joe Paquette Sept. 29th 2019

import javax.swing.*;
public class TestScore
{
   public static void main(String args[]) throws Exception
   {
      int[] stuIds = {1234, 2345, 3456, 4567, 5678};
      int[] stuScores = {0, 0, 0, 0, 0};
      String scoreString = new String();
      final int maxScore = 100;
      String inString, outString = "";
      for(int x = 0; x < stuIds.length; ++x)
      {  
          inString = JOptionPane.showInputDialog(null, 
            "Enter grade for student ID: " + stuIds[x]);
          stuScores[x] = Integer.parseInt(inString);
          try
          {
             if(stuScores[x] > maxScore)
             {
                scoreString = "Grade over " + maxScore;
                throw (new ScoreException(scoreString));
             }  
          }
          catch(ScoreException excep)
          {  
             JOptionPane.showMessageDialog(null, excep.getMessage());  
             stuScores[x] = 0;
          }
       }
       for(int x = 0; x < stuIds.length; ++x)
         outString = outString + "Student ID #" + ids[x] + "  Grade " +
              stuScores[x] + "\n";
       JOptionPane.showMessageDialog(null, outString); 
   }
}