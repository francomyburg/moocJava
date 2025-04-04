import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> historyLog;

    public ChangeHistory(){
        historyLog = new ArrayList<>();
    }

    public void add(double status){
        historyLog.add(status);
    }

    public void clear(){
        historyLog.clear();
    }

    public double maxValue(){
        double max = historyLog.get(0);
        
        for(double amount:historyLog){
            if(amount>max){
                max = amount;
            }
        }
        
        return max;
    }

    public double minValue(){
        double min = historyLog.get(0);
        
        for(double amount:historyLog){
            if(min>amount){
                min = amount;
            }
        }
        
        return min;
    }

    public double average(){
        if(historyLog.isEmpty()){
            return 0;
        }
        
        double sum = 0;
        
        for(double amount:historyLog){
            sum += amount;
        }

        return sum/historyLog.size();
    }

    public String toString(){
        return historyLog.toString();
    }
}
