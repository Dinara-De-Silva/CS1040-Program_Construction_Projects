package paper23;

public class Computer extends Thread{
    private SharedQueue sharedQueue;
    private int currentPrintJobID=0;
    private int id;

    public Computer(SharedQueue sharedQueue,int id){
        this.sharedQueue=sharedQueue;
        this.id=id;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                PrintJob printJob=new PrintJob(id+currentPrintJobID);
                currentPrintJobID++;
                sharedQueue.addPrintJob(printJob);
            }
            catch (TypeNotSupportedException e){
                System.out.println("Invalid File Type");
            }


        }
    }
}
