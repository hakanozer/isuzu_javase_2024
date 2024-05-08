
package days.pkg11;

import java.util.ArrayList;


public class Days11 {

    
    public static void main(String[] args) {
        
        CustomerService customerService = new CustomerService();
        
        //int status = customerService.insert("Filiz", "Bilirler", "filiz@mail.com", "12345");
        //System.out.println("status : " +  status);
        
        //int deleteStatus = customerService.delete(4);
        //System.out.println("deleteStatus :" + deleteStatus) ;
        
        // Update
        //Customer c = new Customer(2, "Mehmet", "Bilsin", "mehmet@mail.com", "54321");
        //int updateStatus = customerService.update(c);
        //System.out.println("updateStatus :" + updateStatus) ;      
        
        /*
        ArrayList<Customer> ls = customerService.allCustomer();
        for(Customer item : ls) {
            System.out.println(item);
        }
        */
        
        boolean loginStatus = customerService.login("zehra@mail.com", "12345");
        System.out.println("loginStatus :" +  loginStatus);
        
        
    }
    
}
