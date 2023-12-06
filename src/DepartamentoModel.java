/**
 * Clase que representa el modelo de datos para los departamentos.
 */
public class DepartamentoModel {
	
	public int dpto_ID;
	public String dpto_nombre;
	public int dpto_localiz_ID;

	
	public void DepartamentoModel(int dpto_ID, String dpto_nombre, int dpto_localiz_ID) {
		
		this.dpto_ID = dpto_ID;
		this.dpto_nombre = dpto_nombre;
		this.dpto_localiz_ID = dpto_localiz_ID;
		
	}
	
}
