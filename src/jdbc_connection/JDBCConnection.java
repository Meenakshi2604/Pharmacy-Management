package jdbc_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	String username = "";
	
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =
			       DriverManager.getConnection("jdbc:mysql://localhost/dbms?" +
			                                   "user=root&password=Karthika@123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
