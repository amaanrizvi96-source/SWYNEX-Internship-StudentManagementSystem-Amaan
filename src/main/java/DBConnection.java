import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/student_management";
        String username = "root";
        String password = "rizvi5566";

        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {

        try {
            Connection connection = getConnection();

            System.out.println("Connected to MySQL successfully!");

            connection.close();

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            System.out.println(e.getMessage());
        }
    }


}
