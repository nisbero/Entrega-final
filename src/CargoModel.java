/**
 * La clase CargoModel representa un modelo para almacenar información sobre cargos.
 * Incluye detalles como el ID del cargo, el nombre, el sueldo mínimo y el sueldo máximo.
 */
public class CargoModel {
	
	public int cargo_ID;
	public String cargo_nombre;
	public int cargo_sueldo_minimo;
	public int cargo_suedlo_maximo;

	
	public void CargoModel(int cargo_ID, String cargo_nombre, int cargo_sueldo_minimo, int cargo_suedlo_maximo ) {
		
		this.cargo_ID = cargo_ID;
		this.cargo_nombre = cargo_nombre;
		this.cargo_sueldo_minimo = cargo_sueldo_minimo;
		this.cargo_suedlo_maximo = cargo_suedlo_maximo;
		
	}
	
}