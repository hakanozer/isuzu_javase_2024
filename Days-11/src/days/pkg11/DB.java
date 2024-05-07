
package days.pkg11;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    
    
    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/isuzu_se";
    private final String username = "sa";
    private final String password = "sa";
    
   
    private Connection conn = null;
    
    public Connection connect() {
            try {
                if (conn == null || conn.isClosed()) {
                    Class.forName(driver);
                    conn = DriverManager.getConnection(url, username, password);
                    System.out.println("Connection Success");
                }
            } catch (Exception e) {
                System.err.println("connect error: "  + e);
        }
        return conn;
    }
    
    
    public void close() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e) {
            System.err.println("close error: " + e);
        }
    }
    
}
