
package days.pkg11;

import java.util.ArrayList;


public class Days11 {

    
    public static void main(String[] args) {
        
        CustomerService customerService = new CustomerService();
        //int status = customerService.insert("Filiz", "Bilirler", "filiz@mail.com", "12345");
        //System.out.println("status : " +  status);
        ArrayList<Customer> ls = customerService.allCustomer();
        for(Customer item : ls) {
            System.out.println(item);
        }
        
    }
    
}
