import java.util.*;

public class Main {
    public static void main(String[] args) {
        //var obj = new HashSet<Integer>();
        //System.out.println(obj.getClass());
        //var test=new TestCollection(obj);

        var hashSetObj = new HashSet<Integer>();
        var treeSetObj = new TreeSet<Integer>();
        var linkedHashSetObj = new LinkedHashSet<Integer>();
        var arrayListObj = new ArrayList<Integer>();
        var linkedListObj = new LinkedList<Integer>();
        var arraydequeObj = new ArrayDeque<Integer>();
        var priorityQueueObj = new PriorityQueue<Integer>();

        ArrayList<Collection> testObjects= new ArrayList<>();
        Collections.addAll(testObjects,hashSetObj,treeSetObj,linkedHashSetObj,arrayListObj,linkedListObj,arraydequeObj,priorityQueueObj);

        for(var obj:testObjects){
            var test=new TestCollection(obj);
            System.out.println(obj.getClass());
            test.createCollection();
            System.out.print("Adding average   : ");
            System.out.println(test.addingAverage());
            System.out.print("Removing Average : ");
            System.out.println(test.removingAverage());
            System.out.print("Clearing Average : ");
            System.out.println(test.clearingAverage());
            System.out.print("Contain Average  : ");
            System.out.println(test.isContainAverage());
            System.out.println("================================================================");
        }

        var hashMapObj=new HashMap<Integer,Integer>();
        var treeMapObj=new TreeMap<Integer,Integer>();
        var linkedHashMapObj=new LinkedHashMap<Integer,Integer>();

        ArrayList<Map> mapObjects=new ArrayList<>();
        Collections.addAll(mapObjects,hashMapObj,treeMapObj,linkedHashMapObj);
        for(var obj:mapObjects){
            var test=new TestMap(obj);
            System.out.println(obj.getClass());
            test.createMap();
            System.out.print("Adding average   : ");
            System.out.println(test.addingAverage());
            System.out.print("Removing Average : ");
            System.out.println(test.removingAverage());
            System.out.print("Clearing Average : ");
            System.out.println(test.clearingAverage());
            System.out.print("Contain Average  : ");
            System.out.println(test.isContainAverage());
            System.out.println("================================================================");
        }



    }
}