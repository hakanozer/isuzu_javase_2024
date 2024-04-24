
package useabstract;


public abstract class Customer {
    
    
    abstract int accountID();
    
    
    public int total() {
        int cid = accountID();
        int totalPrice = 0;
        if  (cid == 100) {
            totalPrice = 1000000;
        }else if (cid == 200) {
            totalPrice = 2000000;
        }
        return totalPrice;
    }
    
    
    public String name() {
        int cid = accountID();
        String customerName = "";
        if (cid == 100) {
            customerName = "Ali Bilsin";
        }else if (cid == 200) {
            customerName = "Erkan Bilirim";
        }
        return customerName;
    }
    
    
}
