import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> itemsBox;

    public OneItemBox(){
        itemsBox = new ArrayList<>(); 
    }

    @Override
    public void add(Item item) {
        if(itemsBox.size()>=1){
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

}
