package manager;

import java.util.UUID;


public class MangerMain {
    
    public static void main(String[] args) {
        
        FileManager manager = new FileManager("sample");
        //manager.create();
        //manager.delete();
        // manager.addLine(UUID.randomUUID().toString());
        manager.read();
    }
    
}
