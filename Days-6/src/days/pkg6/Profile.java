
package days.pkg6;


public class Profile {
    
    int age = 0;
   
    
    public int call( byte count ) {
        int size = 0;
        Action action = new Action();
        String[] arr = action.read(count);
        for (String item : arr) {
            size += item.length();
        }
        return size;
    }
    
    
    
}
