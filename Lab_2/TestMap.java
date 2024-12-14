import java.util.Collection;
import java.util.Map;
import java.util.Random;

public class TestMap {
    Map<Integer,Integer> obj;
    private final int count=100;
    private final int size=100_000;
    public TestMap(Map obj){
        this.obj=obj;
    }

    public void createMap(){
        Random number=new Random();
        Integer element;
        for (Integer i=0;i<size;i++){
            element= number.nextInt(0,100_000);
            obj.put(i,element);
        }
    }

    public long addingAverage(){
        long timeStart;
        long timeEnd;
        Random element=new Random();
        long sum=0;

        for (int i=0;i<count;i++){
            Integer x=element.nextInt(0,100_000);
            timeStart=System.nanoTime();
            obj.put(100_001,x);
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
           if (obj.containsValue(x)) {
                obj.put(100_000,x);
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
            obj.containsValue(x);
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
            createMap();
            sum+=timeEnd-timeStart;
        }
        return sum/count;

    }




}
