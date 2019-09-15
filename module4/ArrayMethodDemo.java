//Farrell - Java Programming - Chapter 8 - Problem 4
// Working with Arrays
//created / revised by Joe Paquette Sept. 15th 2019

public class ArrayMethodDemo
{
    public static void main (String args[])
    {
        int[] values = {43, 29, 11, 26, 49, 32, 18, 12};
        int maxVal = 30;
        display(values);
        displayReverse(values);
        displaySum(values);
        displayLessThan(values, maxVal);
        displayHigherThanAverage(values);
    }
    public static void display(int[] values)
    {
        System.out.print("The values are ");
        for(int i = 0; i < values.length; ++ i)
            System.out.print(values[i] + "  ");            
    }
    public static void displayReverse(int[] values)
    {
        System.out.print("\nThe values in reverse order are "); //display on separate lines
        for(int i = values.length -1; i >=0; -- i)
            System.out.print(values[i] + "  ");            
    }
    public static void displaySum(int[] values)
    {
        int sum = 0;
        for(int i = 0; i < values.length; i++)
        { 
            sum += values[i];
        }
        System.out.println("\nThe sum of all values is " + sum);
    }
    public static void displayLessThan(int[] values, int maxVal)
    {
        for(int i = 0; i < values.length; i++)
            if(values[i] < maxVal)
                System.out.print(values[i] + "  ");
            System.out.println("are less than the max limit " + maxVal);
    }
    public static void displayHigherThanAverage(int[] values)
    {
        int total = 0;
        double average;
        for(int i = 0; i < values.length; ++i)
            total += values[i];
        average = total * 1.0 / values.length;
        System.out.println("The average is " + average);
        for(int i = 0; i < values.length; i++)
            if(values[i] > average)
	      System.out.print(values[i] + "  ");
        System.out.println("are greater than the average");
   }

}