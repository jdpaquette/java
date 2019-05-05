import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        int dozenEggs;
        int eachEggs;
        int numberEggs;
        double dozenPrice;
        double eachPrice;
        double finalPrice;
        double pricePerDozen = 3.25;
        double pricePerEach = .45;
        Scanner input = new Scanner(System.in);
        System.out.print("How many eggs would you like to buy >> ");
        numberEggs = input.nextInt();
        dozenEggs = numberEggs / 12; //find how many dozen eggs customer wants
        eachEggs = numberEggs - (dozenEggs * 12); //find how many individual eggs
        dozenPrice = dozenEggs * pricePerDozen; //price of the dozens
        eachPrice = eachEggs * pricePerEach; //price of the individual eggs
        finalPrice = dozenPrice + eachPrice; //final price calculation
        System.out.println("You ordered " + numberEggs + " eggs.");
        System.out.println("That's " + dozenEggs + " at $3.25 per dozen\n");
        System.out.println("and " + eachEggs + " loose eggs at 45 cents each\n");
        System.out.println("for a total of $" + finalPrice);
    }
}