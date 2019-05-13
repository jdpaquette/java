//Chapter 4 - Exercise 8 - Farrell Java Programming
//created by Joseph Paquette

import java.time.*;
public class TestMonthHandling
{
   public static void main(String[] args)
   {
      LocalDate jan31 = LocalDate.of(2019, 1, 31); //first declare date of 2019 - Janury 31st
      LocalDate dec31 = LocalDate.of(2019, 12, 31); //second declare date of 2019 - December 31st
      System.out.println("First date " + jan31);
      System.out.println("Second date " + jan31.plusMonths(1));
      System.out.println("Third date " + jan31.plusMonths(2));
      System.out.println("Fourth date " + jan31.plusMonths(3));
      System.out.println("First date " + dec31);
      System.out.println("Second date " + dec31.plusMonths(1));
      System.out.println("Third date " + dec31.plusMonths(2));
      System.out.println("Fourth date " + dec31.plusMonths(3));

   }
}
