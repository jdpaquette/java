//Farrell - Java Programming - Exercise 6
//created / revised by Joe Paquette May 2019

import javax.swing.*; 
public class AcmePay
{
   public static void main(String[] args) throws Exception
   {
// set variables for different hourly rates by shift, hours that are worked, 
// regular-overtime (1.5 times), retirement, etc...    
      String entry, message;
      int shift;
      double hoursWorked;
      double regularPay;
      double overtimePay;
      double totalPay;
      double payRate;
      double retDeduction = 0;
      int retOption = 0;
      final double PAY_FIRST = 17.00;
      final double PAY_SECOND = 18.50;
      final double PAY_THIRD = 22.00;
      final int FULLWEEK = 40;
      final double OT_RATE = 1.5;
      final double RET_RATE = 0.03;
      entry = JOptionPane.showInputDialog(null,
         "Please enter shift - 1, 2, or 3");
      shift = Integer.parseInt(entry);
      entry = JOptionPane.showInputDialog(null,
         "Please enter hours worked");
      hoursWorked = Double.parseDouble(entry);
      if(shift == 1)
         payRate = PAY_FIRST;
      else
         if(shift == 2)
            payRate = PAY_SECOND;
         else
            payRate = PAY_THIRD;
      if(hoursWorked > FULLWEEK)
      {
	  regularPay = FULLWEEK * payRate;
	  overtimePay = (hoursWorked - FULLWEEK) * OT_RATE * payRate;
      }
      else
      {
         regularPay = hoursWorked * payRate;
         overtimePay = 0.0;
      }
      totalPay = regularPay + overtimePay;
      if(shift == 2 || shift == 3)
      {
         entry = JOptionPane.showInputDialog(null,
            "Do you want to participate in the retirement plan?\n" +
            "   Enter 1 for Yes and 2 for No.");
         retOption = Integer.parseInt(entry);
         if(retOption == 1)
             retDeduction = totalPay * RET_RATE;
      }
  
       message =
         "\nHours worked is    " + hoursWorked +
         "\nHourly pay rate is " + payRate +
	   "\nRegular pay is     " + regularPay +
	   "\nOvertime pay is    " + overtimePay +
         "\nRetirement deduction is " + retDeduction +
         "\nNet pay is...................." +
            (totalPay - retDeduction);
       JOptionPane.showMessageDialog(null, message);
   }
}





