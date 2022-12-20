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

}
