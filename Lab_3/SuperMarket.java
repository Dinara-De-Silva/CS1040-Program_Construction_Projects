

import java.io.IOException;

public class SuperMarket {
    //main class
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        GroceryItem g1=new GroceryItem(1,"SUGAR",560);
        GroceryItem g2=new GroceryItem(2,"SOAP",100);
        GroceryItem g3=new GroceryItem(3,"PEN",30);
        GroceryItem g4=new GroceryItem(4,"COCONUT OIL",500);

        GroceryStore groceryStore=GroceryStore.getInstance();
        groceryStore.addNewGroceryItem(g1);
        groceryStore.addNewGroceryItem(g2);
        groceryStore.addNewGroceryItem(g3);
        groceryStore.addNewGroceryItem(g4);

//        Cashier cashier = new Cashier("Sandun","Kalutara");
//        Bill bill=new Bill(cashier);
//        bill.addItems(1,2);
//        bill.addItems(3,1);
//        //bill.addItems(004,0.5);
//        bill.printBill();

        Console console = new Console();
        console.start();

    }
}
