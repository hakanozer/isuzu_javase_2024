
package days.pkg12;


public class Action extends Thread{
    
    private String imagePath = "";
    public Action(String imagePath) {
        this.imagePath = imagePath;
    }
    

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Upload: " + imagePath);
            }
            System.out.println("Finish: " + imagePath);
        } catch (Exception e) {}
    }
    
    
    
}
