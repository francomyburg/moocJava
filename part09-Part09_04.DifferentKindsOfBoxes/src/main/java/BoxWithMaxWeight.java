import java.util.ArrayList;
public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    private ArrayList<Item> itemsBox;
    
    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
        itemsBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.weightTotal()+item.getWeight()>maxWeight){
            return;
        }
        itemsBox.add(item);
        
    }

    @Override
    public boolean isInBox(Item item) {
        if(itemsBox.contains(item)){
            return true;
        }
        return false;
    }
    
    public int weightTotal(){
        int total = 0;
        for(Item item:itemsBox){
            total += item.getWeight();
        }

        return total;
    }
    

}
