
package days.pkg5;


public class Days5 {

   
    public static void main(String[] args) {
        
        
        // Nesne üretimi
        Customer customer = new Customer();
        
        customer.entry();
        customer.entry();
        customer.entry();
        customer.entry();
        
        boolean status = customer.customerLogin("ali01", "12345");
        System.out.println("ali01 Status : " + status);
        
        boolean status1 = customer.customerLogin("veli01", "123");
        System.out.println("veli01 Status : " + status1);
        
        
        String data = customer.customerName(20);
        System.out.println(data);
        
        boolean status2 = customer.nameControl("Şeyma");
        System.out.println("status2 :" + status2);
        
    }
    
   
}
