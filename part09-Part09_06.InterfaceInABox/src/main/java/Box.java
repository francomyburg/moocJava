import java.util.ArrayList;

public class Box implements Packable{
   private ArrayList<Packable> items;
   private double maxWeight;

   public Box(double maxWeight){
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
   }

   public void add(Packable item){
        if(this.weight()+item.weight()>maxWeight){
            return;
        }
        items.add(item);
   }

   public double weight(){
        if(items.isEmpty()){
            return 0;
        }
        double totalWeight = 0;
        for(Packable item:items){
            totalWeight += item.weight();
        }

        return totalWeight;
   }

   @Override
   public String toString(){
    return "Box: "+this.items.size()+ " items, total weight "+this.weight()+" kg";
   }

}
