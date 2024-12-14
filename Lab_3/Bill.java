
import java.io.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;

public class Bill implements Serializable {
    private static final long serialVersionID =1L;
    private Cashier cashier;
    private String customerName;
    private HashMap<GroceryItem,Double> list;
    private transient GroceryStore groceryStore;
    public Bill(Cashier cashier) {
        list=new HashMap<>();
        this.cashier = cashier;
        this.groceryStore=GroceryStore.getInstance();
    }

    public void setGroceryStore() {
        this.groceryStore = GroceryStore.getInstance();
    }

    public void setCustomer(String customerID) {
        this.customerName= CustomerLog.getName(customerID);
    }

    public void addItems(int itemCode, double count) throws ItemCodeNotFoundException {
            GroceryItem item = groceryStore.getItem(itemCode);
            System.out.println(item.getItemName());
            list.put(item,count);
    }


    public void printBill(){
        System.out.println("====================================================");
        System.out.println("||                                                ||");
        System.out.println("||           Super Saving Supermarket             ||");
        System.out.println("||                                                ||");
        System.out.println("====================================================");
        System.out.println("Branch Name    : "+cashier.getBranch());
        System.out.println("Cashier's Name : "+cashier.getName());
        System.out.println("Customer's Name: "+customerName);
        System.out.println("---------------------Item List----------------------");
        //-------------------------calculations---------------------------------
        int totalPrice=0;
        int totalDiscount=0;

//        for (Map.Entry<GroceryItem, Double> entry : list.entrySet()) {
//            GroceryItem groceryItem=entry.getKey();
//            System.out.println("Key: " + groceryItem.getItemName() + ", Value: " + entry.getValue());
//        }

        for (Map.Entry<GroceryItem, Double> entry : list.entrySet()){
            //System.out.println(entry.getKey().getItemName());
            GroceryItem item = entry.getKey();
            double price=item.getUnitPrice()* entry.getValue();
            double discount=price*item.getDiscount();
            totalPrice+=price;
            totalDiscount+=discount;
            System.out.println(item.getItemName()+"  "+item.getUnitPrice()+"  "
                    +entry.getValue()+"  "+discount+"%  "+(price-discount));
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Total Discount : "+totalDiscount);
        System.out.println("Total Price    : "+totalPrice);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        System.out.println("----------------------------------------------------");
        System.out.println("||                                                ||");
        System.out.println("||                  Thank You!                    ||");
        System.out.println("||                                                ||");
        System.out.println("====================================================");

    }


//        FileOutputStream fileOutputStream = new FileOutputStream("foo.txt");
//        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
//
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            car carNew=(car)iterator.next();
//            outputStream.writeObject(carNew);
//        }
}

















