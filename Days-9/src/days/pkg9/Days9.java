
package days.pkg9;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hakan
 */
public class Days9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı Girin!");
        String stAge = scanner.nextLine();
        

        try {
            // Hata olma olasılığı olan kodlar yazılır.
            int age = Integer.parseInt(stAge);
            int sum = age + 20;
            System.out.println("Sum: " + sum);
        }catch(Exception ex) {
            // Hata olduğunda çalışan kodlar.
            System.err.println("Lütfen sayısal değer giriniz!");
        }
        
        System.out.println("This Line Call");
        
        
        Random random = new Random();
        File file = new File("sample.txt");
        //file.createNewFile();
        
        Action action =  new Action();
        try {
            int smx = action.sum("a15", "25");
            System.out.println("Smx : " + smx); 
        } catch (Exception e) {
            System.err.println("Sum Test: "+ e);
        }
        
        
    }
    
    
    
}
