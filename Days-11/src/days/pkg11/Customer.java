
package days.pkg11;


public class Customer {
    
    private int cid;
    private String name;
    private String surname;
    private String email;
    private String password;

    public Customer(int cid, String name, String surname, String email, String password) {
        this.cid = cid;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
    
    

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", name=" + name + ", surname=" + surname + ", email=" + email + ", password=" + password + '}';
    }


    
}
