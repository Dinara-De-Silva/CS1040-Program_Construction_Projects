

import java.util.HashMap;

public class CustomerLog {
//    private  int ID;
//    private String name;
    private static HashMap<String, String> customerLog;

    static {
        customerLog=new HashMap<>();
    }
//    public Customer(int ID, String name) {
//        this.ID = ID;
//        this.name = name;
//        customerLog.put(ID,name);
//    }
    private static boolean isRegistered(String ID){
        if(customerLog.containsKey(ID))
            return true;
        return false;
    }
    public static void registerNewCustomer(String ID, String name){
        if(isRegistered(ID))
            System.out.println("Customer is already registered.");
        else{
            customerLog.put(ID,name);
            System.out.println("Registered successfully!");
        }
    }


    public static String getName(String ID) {
        if(isRegistered(ID))
            return customerLog.get(ID);
        System.out.println("Unregistered customer");
        return null;
    }
}
