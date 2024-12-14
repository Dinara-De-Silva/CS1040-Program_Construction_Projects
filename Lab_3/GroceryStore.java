

import java.util.HashMap;

public class GroceryStore {
    private static HashMap<Integer,GroceryItem> store;
    private static GroceryStore groceryStore;

    private GroceryStore(){
        store=new HashMap<>();
    }

    public static GroceryStore getInstance(){
        if (groceryStore==null)
            groceryStore=new GroceryStore();
        return groceryStore;
    }
    public void addNewGroceryItem(GroceryItem groceryItem){
        int id= groceryItem.getItemCode();
        if(!store.containsKey(id)) {
            store.put(id, groceryItem);
            System.out.println(groceryItem.getItemName()+" is added to the store.");
        }else
            System.out.println(groceryItem.getItemName()+" is already existing in the store.");
    }
    public GroceryItem getItem(int id) throws ItemCodeNotFoundException {
        GroceryItem item=store.get(id);
        if (item != null) {
            System.out.println("Return " + id + ": " + item.getItemName());
        } else {
            System.out.println("Item with ID " + id + " not found.");
            throw new ItemCodeNotFoundException();
        }
        return item;
    }
}
