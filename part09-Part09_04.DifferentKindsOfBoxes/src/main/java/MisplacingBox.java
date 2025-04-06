import java.util.ArrayList;

public class MisplacingBox extends Box{
    private ArrayList<Item> itemsBox;

    public MisplacingBox(){
        itemsBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        itemsBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
