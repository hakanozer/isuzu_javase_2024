package days.pkg5;


public class Customer {
    
    
    // Değişkenler, Fonksiyonlar, Nesneler, vb.
    
    // Fonksiyonlar
    // Olulşturma
    // 1- Erişim belirteci -> public, protected, private
    // 2- Geri dönüş değeri -> void, return type
    // 3- Fonksiyon adı -> harf ile başlamalı, boşluk olmamalı, Türkçe karakter olmamalı
    // 4- () -> Fonksiyon parametrelerinin yazdıldığı alan. birden fazla için "," ifadesi ile ayrım yapılır.
    // 5- {} -> Body, Fonksiyon tetiklenmesi sırasında yapılacak işlemler(Kodlar) yazılır.
    
    
    public void entry() {
        System.out.println("entry call-"); 
    }
    
    public boolean customerLogin(String username, String password ) {
        if (username.equals("ali01") && password.equals("12345")) {
            return true;
        }
        return false;
    }
    
    
    public String customerName(int cid) {
        String name = "";
        if (cid == 10) {
            name = "Ali Bilmem";
        }else if (cid == 20) {
            name = "Veli Bilirim";
        }
        
        if ( nameControl(name) ) {
            System.out.println("İçeriyor...");
        }else {
            System.out.println("İçermiyor...");
        }
        
        return name;
    } 
    
    
    public boolean nameControl( String name ) {
        String[] names = {"Ali", "Şeyma", "Ümit", "Çiğdem"};
        for (String item : names) {
            if (name.contains(item)) { 
                return true;
            }
        }
        return false;
    }
    
    
    
}
