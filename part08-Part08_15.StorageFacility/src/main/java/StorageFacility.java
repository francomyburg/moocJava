import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String,ArrayList<String>> storageHashMap;

    public StorageFacility(){
        storageHashMap = new HashMap<>(); 
    }

    public void add(String unit, String item){
        if(!storageHashMap.containsKey(unit)){
            storageHashMap.put(unit,new ArrayList<>());
        }
        storageHashMap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        return storageHashMap.getOrDefault(storageUnit,new ArrayList<>());
    }

    public void remove(String storageUnit, String item){
        storageHashMap.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> storageUnits = new ArrayList<>();
        for(String unit:storageHashMap.keySet()){
            if(!(storageHashMap.get(unit).isEmpty())){
                storageUnits.add(unit);
            }
        }

        return storageUnits;
    }
}
