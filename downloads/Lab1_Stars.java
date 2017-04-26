
/**
 * Write a description of class Lab1_Team here.
 * 
 * @author Jared Kamp   
 * @version 9/10/13
 * 
 * We need a class that will represent Hollywood child stars. 
 * The class will need to hold the name, money earned, amount of arrests, 
 * and average fines for each troubled star. 
 * 
 * The name, money earned, amount of arrests will all be instance fields that need to 
 * be initialized in the constructor by recieving values from outside of the class. 
 * You will also a need a method to calculate how much money they have left over after 
 * being arrested and fined. 
 * 
 * The method will take the average fine which will be a local variable sent in to the 
 * method and multiplying that amount by the amount of arrests and then subtracting that 
 * amount from the money earned by the STAR. 
 * 
 * One last method will print the stars name, total arrests and amount of money they 
 * have left.
 * 
 * Example output:
 * Lindsey Lohan has been arrested 5 times and she has $-259
 */
public class Lab1_Stars
{
    // instance variables - replace the example below with your own
    private int earnings;
    private int arrests;
    private int accountBalance;
    private String starName;
        
    public Lab1_Stars(int in_Earnings, int in_Arrests, String in_StarName)
    {
        // initialise instance variables
        earnings = in_Earnings;
        arrests = in_Arrests;
        starName = in_StarName;
        
        calc();
        print();
    }

    
    public void calc()
    {
        // put your code here
        int averageFine = 7000;
        accountBalance = earnings - arrests * averageFine; //add assumed extra points
    }
    public void print()
    {
        System.out.println(starName + " has $" + accountBalance + " left after being arrested " + arrests + " times last week.");        
    }
}
