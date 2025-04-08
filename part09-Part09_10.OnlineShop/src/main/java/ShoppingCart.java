import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String,Item> storeItems;

    public ShoppingCart(){
        storeItems = new HashMap<>();
    }

    public void add(String product, int price){
        if(storeItems.containsKey(product)){
            storeItems.get(product).increaseQuantity();
            return;
        }
        storeItems.put(product, new Item(product, 1, price));
    }

    public int price(){
        int total = 0;
        for(Item item:storeItems.values()){
            total += item.price();
        }
        return total;
    }

    public void print(){
        for(Item item:storeItems.values()){
            System.out.println(item);
        }
    }
}
