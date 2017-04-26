/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Na'Shea Wiesner
 * @author Jared Kamp
 */
public class Menu {

    private String course;
    private String[] courseItems;
    private double[] itemPrices;
    public Menu(int in_course) {
        courseItems = new String[4];
        itemPrices = new double[4];
        switch (in_course) {
            case 0:
                course = "Drink";
                setDrinks(courseItems);
                break;
            case 1:
                course = "Appetizer";
                setAppetizers(courseItems);
                break;
            case 2:
                course = "Entree";
                setEntrees(courseItems);
                break;
            case 3:
                course = "Dessert";
                setDesserts(courseItems);
                break;
            default: course = "Drink";
                setDrinks(courseItems);
        }

    }
    public String[] getItems()
    {
        return courseItems;
    }
    private void setDrinks(String[] items)
    {        
        items[0] = "Water";
        itemPrices[0] = 0.00;
        items[1] = "Beer";
        itemPrices[1] = 5.00;
        items[2] = "Whiskey";   
        itemPrices[2] = 6.00;
        items[3] = "None";        
        itemPrices[3] = 0.00;
    }
    private void setAppetizers(String[] items)
    {
        items[0] = "Potato Skins";        
        itemPrices[0] = 4.00;
        items[1] = "Spinach & Artichoke Dip";
        itemPrices[1] = 5.00;
        items[2] = "Buffalo Wings";
        itemPrices[2] = 6.00;
        items[3] = "None";
        itemPrices[3] = 0.00;
    }
    private void setEntrees(String[] items)
    {
        items[0] = "Steak";
        itemPrices[0] = 20.00;
        items[1] = "Salad";
        itemPrices[1] = 10.00;
        items[2] = "Steak Salad";   
        itemPrices[2] = 15.00;
        items[3] = "None";
        itemPrices[3] = 0.00;
    }
    private void setDesserts(String[] items)
    {
        items[0] = "Ice Cream";
        itemPrices[0] = 2.00;
        items[1] = "Cookie";
        itemPrices[1] = 1.00;
        items[2] = "Ice Cream & Cookies";
        itemPrices[2] = 2.50;
        items[3] = "None";
        itemPrices[3] = 0.00;
    }
}
