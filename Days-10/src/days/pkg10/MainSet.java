
package days.pkg10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class MainSet {
    
    public static void main(String[] args) {
        
        
        // Set
        // Benzersiz değerleri saklamak için kullanılır.
        Set<String> set = new HashSet<>();
        
        // add item
        set.add("İstanbul");
        set.add("Ankara");
        set.add("Samsun");
        set.add("Bursa");
        set.add("Adana");
        set.add("Samsun");
        set.add("Urfa");
        set.add("Samsun");
        
        System.out.println(set);
        
        // LinkedHashSet
        // Benzersiz değerleri bizim eklediğimiz sıralamaya göre ekler
        Set<String> linkedSet = new LinkedHashSet<>();
        // add item
        linkedSet.add("İstanbul");
        linkedSet.add("Ankara");
        linkedSet.add("Samsun");
        linkedSet.add("Bursa");
        linkedSet.add("Adana");
        linkedSet.add("Samsun");
        linkedSet.add("Urfa");
        linkedSet.add("Samsun");
        
        System.out.println(linkedSet);
    }
    
}
