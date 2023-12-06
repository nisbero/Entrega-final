/**
 * Clase que representa el modelo de localización.
 */
public class LocalizacionModel {

	public int localiz_ID;
	public int loacaliz_ciudad_ID;
	public int loacaliz_pais_ID;
	public String localiz_direccion;

	
	public void LocalizacionModel(int localiz_ID, int loacaliz_ciudad_ID, int loacaliz_pais_ID, String localiz_direccion ) {
		
		this.localiz_ID = localiz_ID;
		this.loacaliz_ciudad_ID = loacaliz_ciudad_ID;
		this.loacaliz_pais_ID = loacaliz_pais_ID;
		this.localiz_direccion = localiz_direccion;
		
	}
	
}
