
package days.pkg11;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerService {
    
    
    public CustomerService() {
        init();
    }
    
    private void init() {
        DB db = new DB();
        try {
            String sql = "create table if not exists customer(\n" +
            "cid int auto_increment,\n" +
            "name varchar(100),\n" +
            "surname varchar(100),\n" +
            "email varchar(100),\n" +
            "password varchar(20),\n" +
            "primary key(cid));";
            db.connect().prepareStatement(sql).execute();
        } catch (Exception e) {
            System.err.println("init error: " + e);
        } finally {
            db.close();
        }
    }
    
    
    public int insert(String name, String surname, String email, String password) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "insert into customer values(default,?,?,?,?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, surname);
            pre.setString(3, email);
            pre.setString(4, password);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("insert error: " + e);
        } finally {
            db.close();
        }
        return status;
    }
    
    public ArrayList<Customer> allCustomer() {
        ArrayList<Customer> ls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from customer";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Customer c = new Customer(cid, name, surname, email, password);
                ls.add(c);
            }
        } catch (Exception e) {
            System.err.println("select error: " + e);
        } finally {
            db.close();
        }
        return ls;
    }
    
    
    public int delete( int cid ) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "delete from customer where cid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, cid);
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("delete error: " + e);
        } finally {
            db.close();
        }
        return status;
    }
    
    
    public int update( Customer c ) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "update customer set name = ?, surname = ?, email = ?, password = ? where cid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, c.getName());
            pre.setString(2, c.getSurname());
            pre.setString(3, c.getEmail());
            pre.setString(4, c.getPassword());
            pre.setInt(5, c.getCid());
            status = pre.executeUpdate();
        } catch (Exception e) {
            System.err.println("update error: " + e);
        } finally {
            db.close();
        }
        return status;
    }
    
    
    public boolean login(String email, String password) {
        DB db = new DB();
        boolean status = false;
        try {
            String sql = "select * from customer where email = ? and password = ? ";
            System.out.println(sql);
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, email);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            status = rs.next();
        } catch (Exception e) {
            System.err.println("login error: " + e);
        } finally {
            db.close();
        }
        return status;
    }
    
}
