
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * Clase que maneja las operaciones CRUD (Crear, Leer, Actualizar, Borrar) en la base de datos.
 */
public class ConexionSQL_CRUD {
	
	
	
public ResultSet Empleado_Select (int id) {
		
		ResultSet rs = null;
	
		try {
			
			String strSQL = "SELECT TOP (1000) *  FROM [dbo].[EMPLEADOS] where empl_ID = ?";
			
			ConexionSQLServer conn = new ConexionSQLServer();
            Connection conexion = conn.obtenerConexion();
            
            PreparedStatement stament = conexion.prepareStatement(strSQL);
            
            stament.setInt(1, id);            
            
            rs = stament.executeQuery();
            
            System.out.println("Select Succefull");	
            
		}		
		catch(Exception e) {
			System.out.println("Error en Select : " + e.getMessage());	
		}
		
		return rs;
		
	}



	
	
	
	
	public void Pais_Insert (PaisModel model) {
		
		try {
			
			String strSQL = "INSERT INTO [dbo].[PAISES]([pais_ID],[pais_nombre]) VALUES(?,?)";
			
			ConexionSQLServer conn = new ConexionSQLServer();
            Connection conexion = conn.obtenerConexion();
            
            PreparedStatement stament = conexion.prepareStatement(strSQL);
            
            stament.setInt(1, model.pais_ID);
            stament.setString(2, model.pais_nombre);
            
            stament.executeUpdate();
            
            System.out.println("Insert Succefull");	
            
		}		
		catch(Exception e) {
			System.out.println("Error en Insert : " + e.getMessage());	
		}
		
	}
	
	
	
	
	
public void Ciudad_Insert (CiudadModel model) {
		
		try {
			
			String strSQL = "INSERT INTO [dbo].[CIUDADES]([ciud_ID],[ciud_pais_ID],[ciud_nombre]) VALUES(?,?,?)";
			
			ConexionSQLServer conn = new ConexionSQLServer();
            Connection conexion = conn.obtenerConexion();
            
            PreparedStatement stament = conexion.prepareStatement(strSQL);
            
            stament.setInt(1, model.ciud_ID);
            stament.setInt(2, model.ciud_pais_ID);
            stament.setString(3, model.ciud_nombre);
            
            stament.executeUpdate();
            
        	System.out.println("Insert Succefull");	
            
		}		
		catch(Exception e) {
			System.out.println("Error en Insert : " + e.getMessage());	
		}
		
	}
	
	




public void Localizacion_Insert (LocalizacionModel model) {
	
	try {
		
		String strSQL = "INSERT INTO [dbo].[LOCALIZACIONES]([localiz_ID],[loacaliz_ciudad_ID],[loacaliz_pais_ID],[localiz_direccion]) VALUES(?,?,?,?)";
		
		ConexionSQLServer conn = new ConexionSQLServer();
        Connection conexion = conn.obtenerConexion();
        
        PreparedStatement stament = conexion.prepareStatement(strSQL);
        
        stament.setInt(1, model.localiz_ID);
        stament.setInt(2, model.loacaliz_ciudad_ID);
        stament.setInt(3, model.loacaliz_pais_ID);
        stament.setString(4, model.localiz_direccion);
        
        stament.executeUpdate();
        
    	System.out.println("Insert Succefull");	
        
	}		
	catch(Exception e) {
		System.out.println("Error en Insert : " + e.getMessage());	
	}
	
}





public void Departamento_Insert (DepartamentoModel model) {
	
	try {
		
		String strSQL = "INSERT INTO [dbo].[DEPARTAMENTOS] ([dpto_ID],[dpto_nombre],[dpto_localiz_ID]) VALUES(?,?,?)";
		
		ConexionSQLServer conn = new ConexionSQLServer();
        Connection conexion = conn.obtenerConexion();
        
        PreparedStatement stament = conexion.prepareStatement(strSQL);
        
        stament.setInt(1, model.dpto_ID);
        stament.setString(2, model.dpto_nombre);
        stament.setInt(3, model.dpto_localiz_ID);
        
        stament.executeUpdate();
        
    	System.out.println("Insert Succefull");	
        
	}		
	catch(Exception e) {
		System.out.println("Error en Insert : " + e.getMessage());	
	}
	
}







public void Cargo_Insert (CargoModel model) {
	
	try {
		
		String strSQL = "INSERT INTO [dbo].[CARGOS]([cargo_ID],[cargo_nombre],[cargo_sueldo_minimo],[cargo_suedlo_maximo]) VALUES (?,?,?,?)";
		
		ConexionSQLServer conn = new ConexionSQLServer();
        Connection conexion = conn.obtenerConexion();
        
        PreparedStatement stament = conexion.prepareStatement(strSQL);
        
        stament.setInt(1, model.cargo_ID);
        stament.setString(2, model.cargo_nombre);
        stament.setInt(3, model.cargo_sueldo_minimo);
        stament.setInt(4, model.cargo_suedlo_maximo);
        
        stament.executeUpdate();
        
    	System.out.println("Insert Succefull");	
        
	}		
	catch(Exception e) {
		System.out.println("Error en Insert : " + e.getMessage());	
	}
	
}






public void Empleado_Insert (EmpleadoModel model) {
	
	try {
		
		String strSQL = "INSERT INTO [dbo].[EMPLEADOS] ([empl_ID],[empl_primer_nombre],[empl_segundo_nombre],[empl_email],[empl_fecha_nac],[empl_sueldo],[empl_comision],[empl_cargo_ID],[empl_dpto_ID]) VALUES (?,?,?,?,?,?,?,?,?)";
		
		ConexionSQLServer conn = new ConexionSQLServer();
        Connection conexion = conn.obtenerConexion();
        
        PreparedStatement stament = conexion.prepareStatement(strSQL);
        
        stament.setInt(1, model.empl_ID);
        stament.setString(2, model.empl_primer_nombre);
        stament.setString(3, model.empl_segundo_nombre);
        stament.setString(4, model.empl_email);
        stament.setString(5, model.empl_fecha_nac);
        stament.setInt(6, model.empl_sueldo);
        stament.setInt(7, model.empl_comision);
        stament.setInt(8, model.empl_cargo_ID);
        stament.setInt(9, model.empl_dpto_ID);
        
        stament.executeUpdate();
        
    	System.out.println("Insert Succefull");	
        
	}		
	catch(Exception e) {
		System.out.println("Error en Insert : " + e.getMessage());	
	}
	
}





public void Empleado_Borrado (int id) {
	
	try {
		
		String strSQL = "UPDATE [dbo].[EMPLEADOS]  SET [empl_primer_nombre] = 'Borrado'   WHERE empl_ID = ?";
		
		ConexionSQLServer conn = new ConexionSQLServer();
        Connection conexion = conn.obtenerConexion();
        
        PreparedStatement stament = conexion.prepareStatement(strSQL);
        
        stament.setInt(1, id);       
        
        stament.executeUpdate();
        
        System.out.println("Borrado Succefull");	
        
	}		
	catch(Exception e) {
		System.out.println("Error en Borrado : " + e.getMessage());	
	}
	
}






public void Empleado_Cambio_Salario (int salario,int id) {
	
	try {
		
		String strSQL = "UPDATE [dbo].[EMPLEADOS]  SET empl_sueldo = ?   WHERE empl_ID = ?";
		
		ConexionSQLServer conn = new ConexionSQLServer();
        Connection conexion = conn.obtenerConexion();
        
        PreparedStatement stament = conexion.prepareStatement(strSQL);
        
        stament.setInt(1, salario);  
        stament.setInt(2, id);       
        
        stament.executeUpdate();
        
        System.out.println("Borrado Succefull");	
        
	}		
	catch(Exception e) {
		System.out.println("Error en Borrado : " + e.getMessage());	
	}
	
}








	

}
