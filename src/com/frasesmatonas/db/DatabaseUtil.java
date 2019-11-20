package com.frasesmatonas.db;
// Inteface that will allow me to connect with the DB
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	
	// protocol 'jdbc' : subprotocol 'mysql' :// host (database location) 'localhost' : 'port' / 'database name'
	private static final String	URL_FORMAT = "jdbc:%s://%s:%s/%s" + 
			"?useUnicode=true" + 
			"&useJDBCCompliantTimezoneShift=true" + 
			"&useLegacyDatetimeCode=false" + 
			"&serverTimezone=UTC";
	// Method that will return the connection 
	public static Connection getConnection() {
		// Define the data that are require to make the connection
		String dbms = "mysql";
		String host = "localhost";
		String port = "3306";
		String databaseName = "frases_matonas";
		String user = "root";
		String password = "root";
		String url = String.format(URL_FORMAT, dbms, host, port, databaseName);
		// Create object 
		//el encargado de crear los chalanes para crear la conexion
		Connection connection = null;
		
		try {
			// class 'Class' method 'forName' it's the driver root
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// know type of error happend
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
