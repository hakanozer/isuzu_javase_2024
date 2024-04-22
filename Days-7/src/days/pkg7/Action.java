
package days.pkg7;


public class Action {
    
    int count = 5;
    String data = "";
    
    // Kurucu method
    // Sınıf adı ile aynı isme sahip olmalıdır.
    // void yada return anahtar kelimesi almazlar.
    
    // this -> kullanıldığı methodun sınıfını işaret eder.
    
    public Action() {
        System.out.println("Action Call");
    }
    
    public Action(int count) {
        this.count = count;
        System.out.println("Action Count:" + count);
    }
    
    public Action(int count, String data) {
        this.count = count;
        this.data = data;
    }
    
    public void fncFor() {
       call =  "Ali";
       for (int i = 0; i < count; i++) {
           System.out.println("i : " + i);  
       }
    }
    
    public String call = " ";
    
}
