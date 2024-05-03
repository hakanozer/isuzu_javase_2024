
package days.pkg10;

import days.pkg10.models.Customer;
import java.util.ArrayList;
import java.util.Collections;



public class MainArrayList {

    
    public static void main(String[] args) {
        
        
        // immutable
        String[] arr = {"İstanbul", "Bursa", "Antalya"};
        System.out.println(arr);
        
        // mutable
        ArrayList<String> ls = new ArrayList();
        
        // add item
        ls.add("İstanbul");
        ls.add("Ankara");
        ls.add("Samsun");
        ls.add("Bursa");
        ls.add("Adana");
        ls.add("Samsun");
        ls.add("Urfa");
        ls.add("Samsun");
        
        // size
        int size = ls.size();
        System.out.println("Size : " + size);
        
        // Get item
        int index = 6;
        if (size > index) {
            System.out.println(ls.get(index));
        }
        
        // remove item
        // ls.remove(2);
        // ls.remove("Samsun");
        
        // filter remove
        boolean removeStatus = ls.removeIf( item -> item.equals("xSamsun") || item.length() > 40 );
        if (removeStatus) {
            System.out.println("Delete Success");
        }else {
            System.out.println("Delete Fail");
        }
        
        // for
        for(String item : ls) {
            System.out.println(item);
        }
        
        // all delete
        // ls.clear();
        
        boolean containsStatus = ls.contains("Bursa");
        System.out.println("containsStatus: " + containsStatus);
        
        
        int indexVal = ls.indexOf("Bursa");
        System.out.println("indexVal: " + indexVal);
        
        // item change
        ls.set(1, "Antalya");
        
        // index add item
        ls.add(1, "Ankara");
        
        // sort
        Collections.sort(ls);
        Collections.reverse(ls);
        
        System.out.println(ls);
        
        System.out.println("===============");
        for(String item : ls) {
            if (item.equals("Samsun")) {
                System.out.println("Samsun True");
                break;
            }
        }
        
        System.out.println("=================");
        
        ArrayList<Customer> cls = new ArrayList<>();
        
        Customer c1 = new Customer();
        c1.setName("Erkan");
        c1.setSurname("Bilmem");
        c1.setAge(30);
        c1.setEmail("erkan@mail.com");
        cls.add(c1);

        Customer c2 = new Customer();
        c2.setName("Selin");
        c2.setSurname("Bil");
        c2.setAge(25);
        cls.add(c2);

        Customer c3 = new Customer();
        c3.setName("Ahmet");
        c3.setSurname("Bilki");
        c3.setAge(35);
        cls.add(c3);
        
        //cls.removeIf( item -> item.getSurname().contains("mem") );
        //cls.removeIf(item -> item.getAge() > 25);
        
        // Customer list loop
        for(Customer item : cls) {
            if (item.getName().equalsIgnoreCase("erkan")) {
                item.setName("Kemal");
            }
            System.out.println( item.getName() + " - "+ item.getSurname() +" - "+ item.getAge() +" - "+ item.getEmail() );
        }
        
        

    }
    
}
