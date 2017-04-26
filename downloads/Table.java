
/**
 *
 * @author Na'Shea Wiesner
 * @author Jared Kamp
 */
public class Table {

    private int tableNumber;
    private Customer[] customers;
    private int customersAtTable;
    private boolean orderComplete;
    private double tableCost;
    private static int nextTableNumber = 0;

    public Table(int numberOfCustomersSeated) {
        tableNumber = getNextTableNumber();
        customersAtTable = numberOfCustomersSeated;
        customers = new Customer[customersAtTable];
        orderComplete = false;
    }

    public void placeCustomerOrder(int customerNumber) {
        if (!orderComplete && customerNumber <= customersAtTable) {
            customers[customerNumber] = new Customer(tableNumber);
            //This code needs to take the new customer's order.
            
            setTableCost(customers[customerNumber].getTotalCost());
            //After customer is done ordering, check to see if the table order is complete.
            if(customerNumber == customersAtTable)
                orderComplete = true;
        }

    }

    public int getCustomersAtTable() {
        return customersAtTable;
    }

    public Customer getCustomer(int customerNumber) {
        if (customerNumber <= customersAtTable) {
            return customers[customerNumber];
        } else {
            return null;
        }
    }

    public boolean getOrderComplete() {
        return orderComplete;
    }

    private int getNextTableNumber() {
        return ++nextTableNumber;
    }

    public double getTableCost() {
        return tableCost;
    }

    private void setTableCost(double customerCost) {
        tableCost += customerCost;
    }

    public int getTableNumber() {
        return tableNumber;
    }
}
