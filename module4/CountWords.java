//Farrell - Java Programming - Chapter 7 - Problem 5
//created / revised by Joe Paquette Sept. 15th 2019

import java.util.*;
public class CountWords
{
    public static void main(String[] args)
    {
        String string;
        Scanner in = new Scanner(System.in);
        char character;
        int val;
        int wordCount = 0;
        int wordLength;
        boolean prevPunctuation = false;
        System.out.println("Enter a phrase >> ");
        string = in.nextLine();
        wordLength = string.length();
        for(val = 0; val < wordLength; val++)
        {
            character = string.charAt(val); //set the punctuation
            if(character == ' ' || character == '.' || character == ';' || character == ',' ||
                character == '!' || character == '-')
            {
                ++wordCount;
                if(prevPunctuation)
                    --wordCount;
                prevPunctuation = true;
            }
            else
                prevPunctuation = false;
        }
        if(!prevPunctuation)
            ++wordCount;
    
        // final output   
        System.out.println("There are " + wordCount + " words in this phrase");
     }
}       