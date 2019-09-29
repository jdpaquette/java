//Farrell - Java Programming - Chapter 12 - Problem 6b
// Exception Handling
//created / revised by Joe Paquette Sept. 29th 2019

public class Course
{
    String crsDepartment;
    int crsNumber;
    double crsCredits;
    final int crsNumLength = 3;
    final int crsNumMinimum = 100;
    final int crsNumMaximum = 499;
    final double crsMinCredits = 0.5;
    final double crsMaxCredits = 6;
    public Course()
    {
       crsDepartment = "";
       crsNumber = 0;
       crsCredits = 0;
    }
    public Course(String deptartment, int number, double credits) throws CourseException
    {
       boolean isBad = false;
       String msg = "";
       crsdepartment = deptartment;
       crsNumber = number;
       crsCredits = credits;
       if(deptartment.length() != crsNumLength)
          msg += "\nThe Course code number must be 3 numerals ";
       if(number < crsNumMinimum || number > crsNumMaximum)
          msg += "\nThe Course number must be between 100 and 499 ";
       if(credits < crsMinCredits || credits > crsMaxCredits)
          msg += "\nThe Course Credits 0.5 and 6 ";
       if(!msg.equals(""))
          throw(new CourseException(msg + "\n   " + crsDepartment + crsNumber +
             "  Credits " + crsCredits));
     }
    public String toString()
    {
       return  crsDepartment + crsNumber + "  Credits " + crsCredits;
    }
 }