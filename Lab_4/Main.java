package paper23;

public class Main {
    public static void main(String [] arg){
        SharedQueue sharedQueue=new SharedQueue(5);

        Computer c1=new Computer(sharedQueue,1000);
        Computer c2=new Computer(sharedQueue,2000);
        Computer c3=new Computer(sharedQueue,3000);

        Printer p1=new Printer(sharedQueue,2233);
        Printer p2=new Printer(sharedQueue,3344);

        Thread t1= new Thread(c1,"c1");
        Thread t2= new Thread(c2,"c2");
        Thread t3= new Thread(c3,"c3");

        Thread t4= new Thread(p1,"p1");
        Thread t5= new Thread(p2,"p1");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
