
package days.pkg6;



public class Days6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Kullanıcıdan değer alınacak
        // kaç adet data beklentisinde
       
        /*
        Action action = new Action();
        String[] arr = action.read((byte) 3);
        
        for (String item : arr) {
            System.out.println(item);
        }
        */
        
        //String[] arr1 = action.read((byte) 2);
        
        Profile profile = new Profile();
        int size = profile.call( (byte) 5);
        System.out.println("Total Count:" + size);
        System.out.println("Age -1:" + profile.age);
        
        Action action = new Action();
        Profile profile1 = action.gotoProfile(30);
        System.out.println("Age -2:" + profile1.age);
        
        action.addLines("Adr-1", "Adr-2", "Adr-3");
        
        
    }
    
    
    
}
