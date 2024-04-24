
package useabstract;


public class Person extends Customer {
    
    int cid = 0;
    public Person (int cid) {
        this.cid = cid;
    }

    @Override
    int accountID() {
        return cid;
    }
    
    
}
