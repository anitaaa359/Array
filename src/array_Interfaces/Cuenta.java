package array_Interfaces;
/*Creacion de una interfaz con dos constantes y 3 métodos 
 * Dos de esos métodos tiene un parámetro String y no retornan nada y el otro 
 * es un método que retorna un String.
 * @author Ana Mª Grad 
 */
public interface Cuenta {
	
	//Constantes
	public static final int MAX_CTA_CORRIENTE = 300;
	public static final int MAX_CTA_NOMINA = 500;
	
	// Métodos
	public void ingresar (double importe);
	public void retirar (double importe);
	public String mostrar ();
	public int getNumeroCuenta();	
}
