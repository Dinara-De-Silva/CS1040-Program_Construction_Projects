

import java.io.*;

public class Console {
    InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(inputStreamReader);
    public void start() throws IOException, ClassNotFoundException {

        System.out.println("WELCOME");
        System.out.println("Please enter cashier's name : ");
        String name = br.readLine();
        System.out.println("Please enter branch name : ");
        String branchName = br.readLine();

        Cashier cashier = new Cashier(name,branchName);

        while (true){
            System.out.println("""
                    Select the task!
                        1. Add a new bill.
                        2. Register a new customer.
                        3. Continue a pending bill.
                        4. Log out.""");
            String command = br.readLine();

            switch (command){
                case "1":
                    addNewBill(cashier);
                    break;
                case  "2":
                    addNewCustomer();
                    break;
                case "3":
                    handlePendingBill();
                    break;
                case "4":
                    System.out.println("Have A good day!");
                    start();
                    break;
                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        }

    }

    private void addNewBill(Cashier cashier) throws IOException {

        Bill newBill = new Bill(cashier);

        System.out.println("""
                Select the task
                    1.Continue as a registered customer
                    2.Continue as an unregistered customer
                    3.Go back""");
        String command=br.readLine();

        switch (command){
            case "1":
                System.out.println("Enter customer ID : ");
                String id=br.readLine();
                newBill.setCustomer(id);
                handleBill(newBill);
                break;
            case "2":
                //do nothing
                handleBill(newBill);
                return;
            case "3":
                return;
            default:
                System.out.println("Invalid Input.Please try again");
                addNewBill(cashier);
                break;
        }
    }
    private void handleBill(Bill currentBill) throws IOException {
        //Bill currentBill =bill;
        while (true){
            System.out.println("""
                Billing process started. Select the task.
                    1. Add an item
                    2. Print the bill.
                    3. Keep as a pending bill""");
            String billCommand = br.readLine();

            switch (billCommand){
                case "1":
                    System.out.println("enter item code : ");
                    int itemCode = Integer.parseInt(br.readLine());
                    System.out.println("enter quantity : ");
                    int quantity = Integer.parseInt(br.readLine());
                    //-------------------------------------------------------newly added part
                    try {
                        currentBill.addItems(itemCode,quantity);
                    } catch (ItemCodeNotFoundException e) {
                        System.out.println("Item code not found");
                    }
                    break;
                case "2":
                    currentBill.printBill();
                    return;
                case "3":
                    //later
                    saveBill(currentBill);
                 //   break;
                    return;
                default:
                    System.out.println("Invalid input.Try again");
                    break;
            }
        }

    }
    private void handlePendingBill() throws IOException, ClassNotFoundException {
        Bill pendingBill = loadPendingBill();
        pendingBill.setGroceryStore();
        System.out.println("pending bill has loaded to the system.");
        handleBill(pendingBill);
    }

    private void addNewCustomer() throws IOException {
        System.out.println("Enter customer ID : ");
        String id = br.readLine();
        System.out.println("Enter customer name : ");
        String name = br.readLine();

        CustomerLog.registerNewCustomer(id,name);
    }

//    public void saveBill(Bill bill) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("POS.ser");
//        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
//        outputStream.writeObject(bill);
//        System.out.println("Bill is saved as a pending bill.");
//    }
//
//    public Bill loadPendingBills() throws IOException, ClassNotFoundException {
//        FileInputStream fileOutputStream = new FileInputStream("POS.ser");
//        ObjectInputStream inputStream=new ObjectInputStream(fileOutputStream);
//
//        Bill pendingBill = (Bill)inputStream.readObject();
//        return pendingBill;
//    }
    public void saveBill(Bill bill) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("pos.txt");
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {
            outputStream.writeObject(bill);
            System.out.println("Bill is saved as a pending bill.");
        }
    }

    public Bill loadPendingBill() throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream("pos.txt");
             ObjectInputStream inputStream = new ObjectInputStream(fileInputStream)) {
            return (Bill) inputStream.readObject();
        }
    }


}
