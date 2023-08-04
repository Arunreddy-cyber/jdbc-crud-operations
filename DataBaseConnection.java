package packg1;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class DataBaseConnection{

		public static Connection getDBConnection() {
			Connection conn = null;
			
			try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mlr", "root", "207y1a3308");
			
			System.out.println("connection established");
			
			}catch(SQLException e) {
//				e.printStackTrace();
			//System.out.println(e);
			}
			return conn;

		}

	}
