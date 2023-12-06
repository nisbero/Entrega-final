/**
 * La clase CiudadModel representa un modelo para almacenar información sobre ciudades.
 */
public class CiudadModel {
	
	public int ciud_ID;
	public int ciud_pais_ID;
	public String ciud_nombre;

	
	public void PaisModel(int ciud_ID,int ciud_pais_ID, String ciud_nombre ) {
		
		this.ciud_ID = ciud_ID;
		this.ciud_pais_ID = ciud_pais_ID;
		this.ciud_nombre = ciud_nombre;
		
	}

}
