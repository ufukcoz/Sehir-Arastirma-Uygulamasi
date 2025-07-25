import java.sql.*;
public class DbHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/world";
    private static final String USER = "root";
    private static final String PASSWORD = "Ufuk2546?";
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
        
    }
    public void showErrorMessage(SQLException exception) {
        System.out.println("error : "+ exception.getMessage());
        System.out.println("error code: "+ exception.getErrorCode());
    }
}
