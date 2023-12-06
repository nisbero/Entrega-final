import java.sql.Date;
/**
 * Clase que representa un modelo de empleado.
 */
public class EmpleadoModel {
	
	public int empl_ID;
	public String empl_primer_nombre;
	public String empl_segundo_nombre;
	public String empl_email;
	public String empl_fecha_nac;
	public int empl_sueldo;
	public int empl_comision;
	public int empl_cargo_ID;
	public int empl_dpto_ID;
	
	public void EmpleadoModel(int empl_ID, String empl_primer_nombre, String empl_segundo_nombre,
								String empl_email, String empl_fecha_nac, int empl_sueldo,
								int empl_comision, int empl_cargo_ID, int empl_dpto_ID) {
		
		this.empl_ID = empl_ID;
		this.empl_primer_nombre = empl_primer_nombre;
		this.empl_segundo_nombre = empl_segundo_nombre;
		this.empl_email = empl_email;
		this.empl_fecha_nac = empl_fecha_nac;
		this.empl_sueldo = empl_sueldo;
		this.empl_comision = empl_comision;
		this.empl_cargo_ID = empl_cargo_ID;
		this.empl_dpto_ID = empl_dpto_ID;		
		
	}
	
}