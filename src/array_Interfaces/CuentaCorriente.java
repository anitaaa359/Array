package array_Interfaces;
// Se implementa a esta clase la interfaz 
public class CuentaCorriente implements Cuenta {
	//Creación de variables
	private int numCuenta;
	private String dni;
	private float saldo;
	private int comision;
	
//Creación de setters and getters
	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float sueldo) {
		this.saldo = sueldo;
	}

	public int getComision() {
		return comision;
	}

	public void setComision(int comision) {
		this.comision = comision;
	}
	
	//Creación del construcctor con todos sus parámetros
	public CuentaCorriente(int numCuenta, String dni, float saldo, int comision) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldo = saldo;
		this.comision = comision;
	}
//Todos los métodos implementados de la interfaz Cuenta con sus funciones según lo pedido
	@Override
	public void ingresar(double importe) {
		saldo += importe;
		
	}

	@Override
	public void retirar(double importe) {
		if (saldo >= importe) {
			saldo -= importe;
		}else {
			System.out.println("\nNotiene Saldo");
		}
		
	}

	@Override
	public String mostrar() {
		
        return "------Cuenta Corriente----- \nNúmero: " + numCuenta + "\n DNI: " + dni + "\n Saldo: " + saldo + "\n Comisión: " + comision;
    }

	@Override
	public int getNumeroCuenta() {
		// TODO Esbozo de método generado automáticamente
		return numCuenta;
	}
}
