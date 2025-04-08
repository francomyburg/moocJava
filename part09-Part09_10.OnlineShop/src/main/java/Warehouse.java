import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String,Integer> productPrices;
    private Map<String,Integer> productStock;

    public Warehouse(){
        productPrices = new HashMap<>();
        productStock = new HashMap<>();      
    }

    public void addProduct(String product, int price, int stock){
        productPrices.put(product,price);
        productStock.put(product,stock);
    }

    public int price(String product){
        if(!productPrices.containsKey(product)){
            return -99;
        }
        return productPrices.get(product);
    }

    public int stock(String product){
        if(!productStock.containsKey(product)){
            return 0;
        }
        return productStock.get(product);
    }

    public boolean take(String product){
        if((!productStock.containsKey(product))||productStock.get(product)==0){
            return false;
        }
        int quantity = productStock.get(product) - 1;
        productStock.put(product,quantity);
        return true;
    }

    public Set<String> products(){
        return productStock.keySet();
    }

}
