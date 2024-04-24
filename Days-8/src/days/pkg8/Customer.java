
package days.pkg8;


public class Customer implements ICustomer, IProfile{

    @Override
    public int customerLogin(String username, String password) {
        return 10;
    }

    @Override
    public String getOneCustomer(int cid) {
        return "Ali Bilmem";
    }

    @Override
    public int customerAge(int cid) {
        return 30;
    }

    @Override
    public boolean customerChangePassword(String oldPassword, String newPassword, int cid) {
        return false;
    }
    
}
