import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translationHash;

    public DictionaryOfManyTranslations(){
        translationHash = new HashMap<>();
    }

    public void add(String word, String translation){
        if(!translationHash.containsKey(word)){
            translationHash.put(word,new ArrayList<String>());
        }
        translationHash.get(word).add(translation);
    }

    public void remove(String word){
        translationHash.remove(word);
    }

    public ArrayList<String> translate(String word){
        return translationHash.getOrDefault(word,new ArrayList<String>());
    } 
}
