import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class TestCollection {
    Collection<Integer> obj;
    private int count=100;
    private int size=100_000;
    public TestCollection(Collection obj){
        this.obj=obj;

    }

    public void createCollection(){
        Random number=new Random();
        Integer element;
        for (int i =0;i<size;i++){
            element=number.nextInt(0,100_000);
            obj.add(element);
           // System.out.println(element);
        }
        //System.out.println("done successfully!");
    }

    public long addingAverage(){
        long timeStart;
        long timeEnd;
        Random element=new Random();
        long sum=0;

        for (int i=0;i<count;i++){
            Integer x=element.nextInt(0,100_000);
            timeStart=System.nanoTime();
            obj.add(x);
            timeEnd=System.nanoTime();
            obj.remove(x);
            sum+=timeEnd-timeStart;
            //System.out.println(timeEnd-timeStart);
        }
        return sum/count;

    }

    public long removingAverage(){
        long timeStart;
        long timeEnd;
        Random element=new Random();
        long sum=0;

        for(int i=0;i<count;i++){
            Integer x=element.nextInt(0,100_000);
            timeStart=System.nanoTime();
            obj.remove(x);
            timeEnd=System.nanoTime();
            if (obj.contains(x)) {
                obj.add(x);
            }
            sum+=timeEnd-timeStart;
            //System.out.println(timeEnd-timeStart);
        }
        return sum/count;
    }
    public long isContainAverage(){
        long timeStart;
        long timeEnd;
        Random element=new Random();
        long sum=0;

        for (int i=0;i<count;i++){
            Integer x=element.nextInt(0,100_000);
            timeStart=System.nanoTime();
            obj.contains(x);
            //System.out.println(x.toString()+" "+obj.contains(x));
            timeEnd=System.nanoTime();
            sum+=timeEnd-timeStart;
        }
        return sum/count;
    }

    public long clearingAverage(){
        long timeStart;
        long timeEnd;
        long sum=0;
        for (int i=0;i<count;i++){
            timeStart=System.nanoTime();
            obj.clear();
            timeEnd=System.nanoTime();
            createCollection();
            sum+=timeEnd-timeStart;
        }
        return sum/count;

    }



}
