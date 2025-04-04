import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> vehicleRegistry;

    public VehicleRegistry(){
        vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if (vehicleRegistry.containsKey(licensePlate)){
            return false;
        }
        vehicleRegistry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate){
        if (!vehicleRegistry.containsKey(licensePlate)) {
            return null;
        }
        return vehicleRegistry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if (!vehicleRegistry.containsKey(licensePlate)){
            return false;
        }
        vehicleRegistry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates(){
        for(LicensePlate license:vehicleRegistry.keySet()){
            System.out.println(license);
        }
    }

    public void printOwners(){
        ArrayList<String> ownersWORepitition = new ArrayList<>();
        
        for(String owner:vehicleRegistry.values()){
            if(!ownersWORepitition.contains(owner)){
                ownersWORepitition.add(owner);
                System.out.println(owner);
            }
        }

    }
}
