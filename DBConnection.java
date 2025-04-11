import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    // i will fix this to env later

    public static Connection getConnect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}