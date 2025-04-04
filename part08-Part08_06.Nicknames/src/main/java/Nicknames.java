
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String,String> nicknames = new HashMap<>();

        nicknames.put("coudet","chacho");
        nicknames.put("dominguez","chori");
        nicknames.put("astrada","negro");

        System.out.println(nicknames.get("dominguez"));
    }

}
