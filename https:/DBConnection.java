import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/library",
                    "root",
                    "");

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
