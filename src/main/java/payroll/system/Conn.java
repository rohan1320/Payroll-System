package payroll.system;
    
import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;
    
    public Conn() {
        String jdbc_url = "jdbc:mysql://localhost:3306/project2";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(jdbc_url, "rohan", "");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
