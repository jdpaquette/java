//Farrell - Java Programming - Chapter 13 - Problem 6
// File Input Output
//created / revised by Joe Paquette Sept. 29th 2019

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class ValidateCheckDigits
{
   public static void main(String[] args)
   {
      Path fileIn =
         Paths.get("G:\\Java\\module6\\validateIn.txt");
      Path fileOut =
         Paths.get("G:\\Java\\module6\\validateOut.txt");
      String accounts;
      int acctNumbers;
      int finalNumeral;
      int numeral;
      int sum;
      int x;
      String newline = "\n";
      InputStream input = null;
      OutputStream output = null;
      try
      {
         input = Files.newInputStream(fileIn);
         BufferedReader reader = new BufferedReader
            (new InputStreamReader(input));
         output = Files.newOutputStream(fileOut);
         accounts = reader.readLine();
         while(accounts != null)
         {
            sum = 0;
            acctNumbers = Integer.parseInt(accounts);
            finalNumeral = acctNumbers % 10; // modulo leaves the remainder...
            acctNumbers = acctNumbers / 10;
            for(x = 0; x < 6; x++) 
            {
                numeral = acctNumbers % 10;
                acctNumbers = acctNumbers / 10;
                sum = sum + numeral;
            }
            sum = sum % 10;
            if(sum == finalNumeral)
            { 
              System.out.println(accounts + " is accepted");
              accounts = accounts + System.getProperty("line.separator");
              byte[] data = accounts.getBytes();
              output.write(data);
            }
            else
            {
               System.out.println(accounts + " is not-accepted");
            }
            accounts = reader.readLine();
         }
         input.close();
         output.close();
       }
       catch (IOException e)
       {
          System.out.println(e);
       }
   }
}

