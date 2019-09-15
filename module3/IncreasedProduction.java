//Farrell - Java Programming - Chapter 6 - Problem 9 
//created / revised by Joe Paquette Sept. 8th, 2019

public class IncreasedProduction
{
   public static void main (String[] args)
// assign variables for months, goals met, how much they produced, profits
   {
      int month;
      int monthGoalsMet = 0;
      double production = 4_000;
      double netProfit;
      final double PRODUCTION_INCREASE = 0.06;
      final double GOAL = 7_000;
      final int MONTHS = 24;
      boolean goalMet = false;
      for(month = 1; month <= MONTHS; ++month)
      {
         production += production * PRODUCTION_INCREASE;
         if(production > GOAL && !goalMet)
         {
            monthGoalsMet = month;
            goalMet = true;
         }
         System.out.println("Month " + month + "     Predicted production is " +
            production);

      }
      System.out.println("\nThe month in which production exceeds " +
         GOAL + " is month " + monthGoalsMet);
   }
}

