import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1: Register/load the drive
		Class.forName("Oracle.jdbc.OracleDriver");

		// Step 2: Establish Connectivity
		Connection con = null;
		
		// getConnection(String url, String user, String password)
		
		// call the method using connection object
		// con = DrivenManager.getConnection("url","username","password");
		//url - jdbc:oracle:thin:@localhost:51521:xe
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:51521:xe","SYSTEM","root");
		if(con!= null) {
			System.out.println("estalished!!!");
		}
		else {
			System.out.println(" Not connected!!!");
		}
	}
}