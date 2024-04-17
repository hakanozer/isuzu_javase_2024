
package days.pkg6;

import java.util.Scanner;


public class Action {
    
    
    public String[] read(byte count) {
        String[] arr = new String[0];
       
        if (count > 0) {
            arr = new String[count];
            Scanner read = new Scanner(System.in);
            for (int i = 0; i < count; i++) {
                System.out.println((i+1) + ". Değeri Giriniz!");
                arr[i] = read.nextLine();
            }
        }
        return arr;
    }
    
    
    public Profile gotoProfile( int age ) {
        Profile pro = new Profile();
        pro.age = age;
        return pro;
    }
    
    
    public void addLines(String... lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
    
    
}
