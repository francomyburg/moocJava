import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> creditors;

    public IOU(){
        this.creditors = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        creditors.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if(!creditors.containsKey(toWhom)){
            return 0;
        }
        return creditors.get(toWhom);
    }

    

}
