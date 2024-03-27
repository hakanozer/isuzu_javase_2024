
package days.pkg2;

import java.util.Random;

/**
 *
 * @author hakan
 */
public class Days2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 10;
        num1 = 20;
        // num1 = "Ali";
        
        // object
        Object obj1 = 10;
        obj1 = "Ali";
        obj1 = new Random();
        Random rand = new Random();
        
        // Object to ...
        Random obj1Random = (Random) obj1;
        
        // String kontrol
        if ( obj1 instanceof String ) {
            // Object içinde String var
        }
        
        // Array
        // Dizi oluşturma
        String[] arr = {"İstanbul", "Ankara", "Samsun", "Antalya", "Bursa"};
        // diziler immutable -> daha sonradan değişim yok (Ekleme, Silme)
        
        // index -> dizi içindeki elemenlara erişim için vardır, 0 dan başlar.
        String data1 = arr[1];
        System.out.println( data1 );
        System.out.println( data1.length() );
        System.out.println("This line call");
        
        // dizi içindeki toplam eleman sayısı
        // Günlük hayattaki gibi bir sayma yapar, 1 den başlar.
        int count = arr.length;
        System.out.println("Count: " + count);
        
        // Toplu işlemler
        System.out.println(arr);
        
        boolean status = true;
        // loop
        for(int i = 0; i < arr.length; i++) {
            String city = arr[i];
            System.out.println("for call : " + i + " - " + city);
            if (i == 4) {
                status = false;
            }
        }
        
        
        arr[2] = "Giresun";
        System.out.println("=====================");
        for(String item : arr) {
            System.out.println(item);
        }
        
        
        System.out.println("=====================");
        arr = new String[]{};
        System.out.println(arr.length);
        
        int x = 0;
        
        String a = "";
        Random r = new Random();
        System.out.println(a.chars());
        
        
    }
    
}
