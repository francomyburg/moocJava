import java.util.HashMap;

public class Abbreviations {
    HashMap<String,String> hashmapAbbre;

    public Abbreviations(){
        this.hashmapAbbre = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        if (!(hasAbbreviation(stringCleaner(abbreviation)))){
            hashmapAbbre.put(stringCleaner(abbreviation), explanation);
        }else{
            System.out.println("abbreviation already registered");
        }
    }
    
    public boolean hasAbbreviation(String abbreviation){
        
        String toSearch = stringCleaner(abbreviation);
        
        if(hashmapAbbre.containsKey(toSearch)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        return hashmapAbbre.get(stringCleaner(abbreviation));
    }

    public static String stringCleaner(String string){
        if(string==null){
            return "";
        }

        return string.toLowerCase().trim();
    }

    public HashMap<String, String> getHashmapAbbre() {
        return hashmapAbbre;
    }

    
}
