
package days.pkg10;

import java.util.HashMap;
import java.util.Set;


public class MainHashMap {
    
    public static void main(String[] args) {
        
        // HashMap
        HashMap<String, String> hm = new HashMap<>();
        
        // Add item
        hm.put("name", "Ahmet");
        hm.put("name", "Zafer");
        hm.put("surname", "Bilsinler");
        hm.put("email", "zafer@mail.com");
        hm.put("city", "Ankara");
        
        //get data
        System.out.println( hm.get("surname") );
        
        // loop
        Set<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.println(key + " - " + hm.get(key));
        }
        
        System.out.println(hm.size());
        
        hm.remove("name");
        System.out.println(hm);
        
    }
    
}
