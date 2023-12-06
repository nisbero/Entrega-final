
import java.sql.*;
/**
 * Clase de utilidad para obtener una conexión a Microsoft SQL Server.
 */
public class ConexionSQLServer {	
	
	public Connection obtenerConexion() {	
		
		Connection conexion = null; 
		
		try {
			
			//String con = "jdbc:sqlserver://DESKTOP-72P052O\\SQLEXPRESS;databaseName=Recursos_Humanos;user=sa;password=Admin2020*.;";
			String con = "jdbc:sqlserver://192.168.1.3;databaseName=Recursos_Humanos;user=sa;password=Admin2020*.;encrypt=false;trustServerCertificate=false;";
			
			conexion = DriverManager.getConnection(con, "sa", "Admin2020*.");
			
			System.out.println("Conexion a DB extosa: ");			
						
		}
		catch(Exception e)
		{
			System.out.println("Error al conectarse a base de datos : " + e.getMessage());			
		}
		
		return conexion;
		
	}
	
}
