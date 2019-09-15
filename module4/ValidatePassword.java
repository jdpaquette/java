//Farrell - Java Programming - Chapter 7 - Problem 7
//created / revised by Joe Paquette Sept. 15th 2019

import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class ValidatePassword
{
    public static void main(String[] args)
    {
        String aString;
        int stringSize;
        final int numberUpperLetters = 2;
        final int numberLowerLetters = 3;
        final int numberNumerals = 1;
        int upperTotal = 0;
        int lowerTotal = 0;
        int numeralTotal = 0;
        int letterTotal = 0;
        Scanner in = new Scanner(System.in);
        int numberSpaces = 0;
        System.out.print("Enter a string >> ");
        aString = in.nextLine();
        stringSize = aString.length();
        
        for(int i = 0; i < stringSize; i++)
        {
            char ch = aString.charAt(i);
            if(Character.isUpperCase(ch))
                upperTotal++;
            else
                if(Character.isLowerCase(ch))
                    lowerTotal++;
                else
                    if(Character.isDigit(ch))
                        numeralTotal++;        
        }
        if(upperTotal >= numberUpperLetters && lowerTotal >= numberLowerLetters && numeralTotal >= numberNumerals)
            System.out.println("Your Password is Valid");
        else
        {
            System.out.println("Your password is missing the following:");
            if(upperTotal < numberUpperLetters)
                System.out.println("uppercase letters");
            if(lowerTotal < numberLowerLetters)
                System.out.println("lowercase letters");
            if(numeralTotal < numberNumerals)
                System.out.println("numerals");
        }
    }
}