package ConnctionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	    static Connection con=null;
	    static String url="jdbc:mysql://localhost:3306/employee_db";
	    static String un="root";
	    static String pwd="sum@23ma@45";
	
	public static Connection requestConnection() throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(url,un,pwd);
		 return con;
	}

}
