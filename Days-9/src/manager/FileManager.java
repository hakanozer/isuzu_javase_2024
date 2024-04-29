package manager;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileManager {

    private File file = null;
    private final String filesName = "files";

    public FileManager(String fileName) {
        folderControl();
        fileName = filesName + "/" + fileName + ".txt";
        file = new File(fileName);
    }

    private void folderControl() {
        try {
            File folderFile = new File(filesName);
            if (!folderFile.exists()) {
                folderFile.mkdir();
            }
        } catch (Exception e) {
            System.err.println("folderControl fail: " + e);
        }
    }

    public void create() {
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.err.println("create fail: " + e);
        }
    }

    public void delete() {
        file.delete();
    }
    
    public void addLine(String line) {
        try {
            
            FileWriter writer = new FileWriter(file, true);
            writer.append(line);
            writer.append(System.lineSeparator());
            writer.close();
            
        } catch (Exception e) {
            System.err.println("addLine fail: " + e);
        }
    }
    
    public void read() {
        try {
            Scanner scanner = new Scanner(file);
            
            int i  = 0;
            while (scanner.hasNextLine()) {                
                String line = scanner.nextLine();
                //System.out.println(line);
                if (line.contains("#")) {
                    
                }else {
                    String[] arr = line.split("=");
                    String key = arr[0];
                    String val = "";
                    
                    if (arr.length > 1) {
                        val = arr[1];
                    }
                    System.out.println(i+ " - key:"+key + "-val:" + val);
                }
                i++;
            }
        } catch (Exception e) {
            System.err.println("read fail: " + e);
        }
    }

}
