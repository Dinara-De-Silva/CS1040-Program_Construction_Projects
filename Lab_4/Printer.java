package paper23;

import java.awt.print.PrinterJob;

public class Printer extends Thread{
    private SharedQueue sharedQueue;
    int id;
    public Printer(SharedQueue sharedQueue,int id){
        this.id=id;
        this.sharedQueue=sharedQueue;
    }

    @Override
    public void run() {
        try {
            while (true){
                PrintJob printerJob=sharedQueue.getPrintJob();
                System.out.println("printing printjoj id="+printerJob.getJobID());
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println("ERROR in printing");
        }
    }
}
