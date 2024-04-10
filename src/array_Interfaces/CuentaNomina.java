package array_Interfaces;

//Se implementa a esta clase la interfaz 
public class CuentaNomina implements Cuenta {
	
	//Creación de variables
	private int numCuenta;
	private String dni;
	private float saldo;

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

	//Creación del construcctor con todos sus parámetros
	public CuentaNomina(int numCuenta, String dni, float saldo) {
		super();
		this.numCuenta = numCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}
	//Todos los métodos implementados de la interfaz Cuenta con sus funciones según lo pedido
	@Override
	public void ingresar(double importe) {
		saldo += importe;
		
	}

	@Override
	public void retirar(double importe) {
		
		if (saldo >= importe ) {
			saldo -= importe;
		}else {
			System.out.println("\nNo tiene suficiente saldo");
		}
	}

	@Override
	public String mostrar() {
		return "----- CUENTA DE LA NÓMINA ---- \nNúmnero de la cuenta: " + numCuenta + "\nDni del titular: " + dni + "\nSaldo disponible: " + saldo ;
		
	}

	@Override
	public int getNumeroCuenta() {
		// TODO Esbozo de método generado automáticamente
		return numCuenta;
	}
}
