import controllers.Customer;
import controllers.Item;
import controllers.Orders;
import controllers.Sales;
import controllers.menu.Menu;


public class Main {
    public static void main(String[] args) {
       // Item.getAllItems();
       // Item.createNewItem();
       // Item.getAllItems();
       // Item.updateItem();
       // Item.getAllItems();
        //Item.deleteItem();
       // Item.getItemById();

        Customer.createCustomerTable();
        Item.createItemsTable();
        Orders.createOrdersTable();
        Sales.createSalesTable();
        //subsequent objects will have their create table methods here

        Menu.mainMenu();



    }

    //Exercise
    // Add two features to this application that allows user to view
    //all the orders and all the sales.

    //Exercise
    //Create a method on the sales class that takes in the
    //following input from the user:
    // item id, qty purchased

    //Exercise
    //Complete the sales class by adding the following methods:
    // Add a method called create a new sale:
    // -collate the total price of all the items bought using the
    // handleItemTotal method and log the total to the console


}
