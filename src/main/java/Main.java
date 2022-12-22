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


    // Exercise
    // Create a table that is called Students and another table
    // called Grades.
    // The columns on the students table should be: id, name, age
    // Complete the controllers for the Students table by adding
    // methods to handle CRD operations on each record in the table.
    // On the Grades table, store the student's id, score and the
    // Grade where for each Grade:
    // 0-40 F, 41-49 D, 50-59 C, 60-69 B, 70-100 A.
    // Complete the controller on tge Grades table to have CRD operations.
    // For the read operation you should be able to see the students
    // information as well.

}
