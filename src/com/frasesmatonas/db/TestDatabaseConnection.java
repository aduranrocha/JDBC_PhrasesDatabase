package com.frasesmatonas.db;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.sql.Connection;
import java.sql.SQLException;


public class TestDatabaseConnection {
	// Quiero validar si mi conexion existe
	@Test
	public void testConnection() {
		Connection connection = DatabaseUtil.getConnection();
		assertNotNull("No se realizo la conexion",connection);
		try {
			connection.close();
			// Check if the connection was closed
			assertTrue("No se cerro la conexion",connection.isClosed());
		}catch (SQLException e) {
		}
		//DatabaseUtil.closeConnection(connection);
	}
}
