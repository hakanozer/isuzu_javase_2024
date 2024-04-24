package useabstract;


public class MainAbstract {
    
    public static void main(String[] args) {
        
        Person person = new Person(100);
        int total = person.total();
        String name = person.name();
        System.out.println(name + " - " + total);
        
        // ---------------------------------
        /*
        Customer customer = new Customer() {
            @Override
            int accountID() {
                return 100;
            }
        };
        int cTotal = customer.total();
        String cName = customer.name();
        System.out.println(cName + " - " + cTotal);
        */
        
    }
    
}
