package paper23;

import java.util.ArrayList;
import java.util.List;

public class SharedQueue {
    private List<PrintJob> printJobs;
    private int capacity;
    public SharedQueue(int capacity){
        this.capacity=capacity;
        printJobs=new ArrayList<>(capacity);
    }
    public synchronized void addPrintJob(PrintJob printJob){
        while (printJobs.size()==capacity){
            try {
                wait();
            }
            catch (InterruptedException e){
                System.out.println("ERROR!!!");
            }
        }
        printJobs.add(printJob);
        System.out.println("new printjob added by "+Thread.currentThread().getName());
        notifyAll();
    }
    public synchronized PrintJob getPrintJob(){
        while (printJobs.isEmpty()){
            try{
                wait();
            }
            catch (InterruptedException e){
                System.out.println("ERROR!!!");
            }
        }
        PrintJob printJob=printJobs.get(0);
        printJobs.remove(0);
        notifyAll();
        return printJob;
    }
}
