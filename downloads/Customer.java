import java.util.Scanner;
/**
 *
 * @author Na'Shea Wiesner
 * @author Jared Kamp
 */
public class Customer {
    
private String name;
private int table;
private int drink;
private int appetizer;
private int entree;
private int dessert;
private double totalCost;
private double drinkPrice;
private double appetizerPrice;
private double entreePrice;
private double dessertPrice;
    public Customer(int tableNumber)
    {
        name = "";
        drink = 0;
        drinkPrice = 0.00;
        appetizer = 0;
        appetizerPrice = 0.00;
        entree = 0;
        entreePrice = 0.00;
        dessert = 0;      
        dessertPrice = 0.00;  
        totalCost = 0.00;
    }
    public double getTotalCost()
    {
        return totalCost;
    }
    private void setTotalCost(double itemPrice)
    {
        totalCost += itemPrice;
    }
    public int getTable()
    {
        return table;
    }
}
