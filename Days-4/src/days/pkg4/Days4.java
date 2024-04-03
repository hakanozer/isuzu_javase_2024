
package days.pkg4;

/**
 *
 * @author hakan
 */
public class Days4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // While
        
        int i = 0;
        while( true ) {
            
            System.out.println("this line call : " + i);
            
            i++;
            if (i == 10) break;
            
        }
        
        String[] arr = {"Ali", "Veli", "Mehmet", "Zehra"};
        for (int j = 0; j < arr.length; j++) {
            String string = arr[j];
            System.out.println("for item :" + string);
        }
        
        
        int x = 0;
        while(x < arr.length) {
            String string = arr[x];
            System.out.println("While item :" + string);
            x++;
        }
        
        // do - while
        int y = 0;
        do {
            System.out.println("do while call :" + y);
            y++;
        }while (y < 5);
        
        
        String day = "Çarşamba";
        if (day.equals("Pazartesi")) {
            
        }
        if (day.equals("Salı")) {
            
        }
        if (day.equals("Çarşamba")) {
            
        }
        if (day.equals("Perşembe")) {
            
        }
        
        // switch
        switch(day) {
            case "Pazartesi":
                System.out.println("This Day " + day );
                break;
            case "Salı":
                System.out.println("This Day " + day );
                break;
            case "Çarşamba":
                System.out.println("This Day " + day );
                break;
            case "Perşembe":
                System.out.println("This Day " + day );
                break;
                default:
                    System.out.println("Day Fail");
                break;
        }
        
        String[] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe"};
        for (int j = 0; j < days.length; j++) {
            String day1 = days[j];
            if (day1.equals(day)) {
                // yapılacak işler
            }
        }
        
        
        // Nesne üretimi
        Profile profile = new Profile();
        Action obj = new Action();
        // Action -> Class Türü
        // obj -> Class nesnesi(Kullanılabilir Yer)
        // new -> Class içindeki özelliklerin bellekte hazırlanmasını sağlar.
        // Action() -> Kurucu method
        // Javada her Class Object  Class'ından kendisine miras alır.
        // Nesne içerisinde (.) operatörü ile özellikler kullanılır.
        
        
        obj.city = "Ankara";
        obj.age = 50;
        System.out.println(obj.age);
        System.out.println(obj.city);
        
        Action obj1 = new Action();
        System.out.println( obj1.city );
        
        //obj1.token = "123token";
        System.out.println(obj1.token);
        
         
    }
    
}
