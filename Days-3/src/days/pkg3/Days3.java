
package days.pkg3;

/**
 *
 * @author hakan
 */
public class Days3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name1 = "Ali";
        String name2 = "Erkan";
        
        if ( name1.equals(name2) ) {
            System.out.println("String == true");
        }
        
        if ( !name1.equals(name2) ) {
            System.out.println("String == false");
        }
        
        int a = 10;
        int b = 11;
        boolean status = false;
        
        // mantıksal operatörler
        status = a > b;
        System.out.println("a > b " + status);
        
        status = a < b;
        System.out.println("a < b " + status);
        
        status = a == b;
        System.out.println("a == b " + status);

        status = a >= b;
        System.out.println("a >= b " + status);
        
        status = a <= b;
        System.out.println("a <= b " + status);
        
        // logic operatörler
        // || -> veya -> sol taraftaki şart yada sağ tarafta bulunan şartlardan bir tanesinin gerçekleşmesi 
        boolean ifStatus = a > 100 || b > 10;
        ifStatus = b > 10 || a > 100;
        
        if ( ifStatus ) {
            System.out.println("ifStatus : " + ifStatus);
        }
        
        // && -> ve -> sol taraftaki şart ile sağ taraftaki şartın sağlanması durumu
        ifStatus = b > 90 && a == 10;
        System.out.println("ifStatus : " + ifStatus);
        
        // one line if
        String data = a > b ? "Büyük" : "Küçük";
        System.out.println(data);
        
        String name = "Ali";
        String surname = "Bilmem";
        String email = "ali@mail.com";
        String password = "1234";
        
        // else - if
        if (name.equals("")) {
            System.out.println("name empty!");
        }else if (surname.equals("")) {
            System.out.println("surname empty!");
        }else if (email.equals("")) {
            System.out.println("email empty!");
        }else if (password.equals("")) {
            System.out.println("password empty!");
        }else if (password.length() < 5) {
            System.out.println("password chars length fail - min 5 char ");
        }else {
            System.out.println("Form Send");
        }
       
        System.out.println("==========================");
        String[] user = {"Erkan","Bilsin","erkan@mail.com",""};
        String[] message = {"Erkan name empty!", "surname empty!", "email empty!", "password empty!"};
        
        for (int i = 0; i < user.length; i++) {
            String item = user[i];
            
            for (int j = 0; j < message.length; j++) {
                String mes = message[j];
                if (mes.contains(item)) {
                    //System.out.println("Search Success : " + j);
                }
            }
            
            if (item.equals("")) {
                System.out.println( message[i] );
                break; // döngüyü kır, durdur.
            }
        }
        
        
        // label break
        forLabel : for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                if (j == 1) {
                    continue; // pas geç ve devam et.
                }
              
                if (j == 5 ) {
                    break forLabel;
                }
                System.out.println("i - " + i + " j - " + j);
                
            }
            
        }
        
        
        
        
        
        
    }
    
}
