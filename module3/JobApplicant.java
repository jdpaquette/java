//Farrell - Java Programming - Chapter 5 - Problem 7a
//created / revised by Joe Paquette Sept. 8th, 2019

public class JobApplicant
// assign the variables in this first part of the problem-
// name, phone number, separate office skills
{
   private String name;
   private String phoneNumber;
   private boolean wordSkill;
   private boolean spreadsheetSkill;
   private boolean databaseSkill;
   private boolean graphicsSkill;
   public JobApplicant(String name, String phoneNumber, boolean w, boolean s, boolean d, boolean g)
   {
      this.name = name;
      this.phoneNumber = phoneNumber;
      wordSkill = w;
      spreadsheetSkill = s;
      databaseSkill = d; 
      graphicsSkill = g;
   } 
   public String getName()
   {
      return name;
   }
   public String getPhoneNumber()
   {
      return phoneNumber;
   }
   public boolean getwordSkill()
   {
      return wordSkill;
   }
   public boolean getspreadsheetSkill()
   {
      return spreadsheetSkill;
   }
   public boolean getdatabaseSkill()
   {
      return databaseSkill;
   }
   public boolean getgraphicsSkill()
   {
      return graphicsSkill;
   }
}