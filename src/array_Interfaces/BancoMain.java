package array_Interfaces;
/*
 * Se crea un menú con distintas opciones:
 * 1. Es el alta de la cuenta corriente, donde se solicita los datos de cuenta incluyendo/posicionando estos mismos en el array
 * 2. Es el alta de la cuent nomina, que deberá hacer lo mismo que en la cuenta corriente
 * 3. Es la muestra de todos los tipos de cuentas, enumerándolas 
 * 4. Es el ingreso de dinero en las cuentas, donde se tendra que visualizar todas las cuentas 
 * 		y tambien poder distinguir el tipo de cuenta que es para el ingreso correcto
 * 5. Es la retirada de dinero y es lo mismo que el ingreso, pero llamando al metodo de retirar
 * 
 */
import java.util.Scanner;

public class BancoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//Declaramos un objeto de la clase Cuenta y una variable numero de cuentas
		final Cuenta[] cuentas = new Cuenta[25];
		int numCuentas = 0;
		
		int opcion ;
		
	//Un bucle do-while, que contiene un switch
		do {
           
            opcion = menu(sc);
            
		switch (opcion) {
		case 1:
           
        	numCuentas = altaCuentaCorriente(sc, cuentas, numCuentas);            
            break;
            
        case 2:
        	
        	numCuentas = altaCentaNomina(sc, cuentas, numCuentas);
            break;
            
        case 3:
        	
        	mostrarCuentas(cuentas, numCuentas);        	
            break;
            
        case 4:  	
        	
        	ingresar(sc, cuentas, numCuentas);
            break;     
            
        case 5:
        	
        	retirar(sc, cuentas, numCuentas);       
            break;
            
        case 6:
        	
            System.out.println("¡GOOD BYE!");
            break;
            
        default:
        	
            System.out.println("No válido. Prueba otra vez.");
		}

		}while (opcion != 6);

		
	sc.close();}
//Creación del menú con todas sus opciones
	private static int menu(Scanner sc) {
		int opcion;
		System.out.println("\n1. Alta Cuenta Corriente");
		System.out.println("2. Alta Cuenta Nómina");
		System.out.println("3. Mostrar Cuentas");
		System.out.println("4. Ingresar");
		System.out.println("5. Retirar");
		System.out.println("6. Salir");
		System.out.print("Seleccione una opción: ");
		opcion = sc.nextInt();
		return opcion;
	}	
//Creacion del método alta de la cuenta corriente	
	private static int altaCuentaCorriente(Scanner sc, final Cuenta[] cuentas, int numCuentas) {
		
		if (numCuentas < 25) {
		// Se pedirán los datos al usuario y se leerán	
		    System.out.print(" Número de cuenta: ");
		    int numCuenta = sc.nextInt();
		    
		    System.out.print("DNI del titular: ");
		    String dni = sc.next();
		    
		    System.out.print("Saldo: ");
		    float saldo = sc.nextFloat();
		    
		    System.out.print("Comisión: ");
		    int comision = sc.nextInt();
		    //Creo un objeto de la clase cuenta corriente 
		    CuentaCorriente cuentaCorriente = new CuentaCorriente(numCuenta, dni, saldo, comision);
		    cuentas[numCuentas] = cuentaCorriente; 
		    numCuentas++;
		    
		    System.out.println("\nAlta de cuenta corriente correctamente realizada");
		    
		} else {
		    System.out.println("No se pueden añadir más cuentas.");
		}
		return numCuentas;
	}
//Creación del método alta de la cuenta nómina	
	private static int altaCentaNomina(Scanner sc, final Cuenta[] cuentas, int numCuentas) {
		//Se piden los datos y se leen 
		if (numCuentas < 25) {
			System.out.println("Número de cuenta: ");
			int numCuenta = sc.nextInt();
			
			System.out.println("Dni del titular: ");
			String dni = sc.nextLine();
			
			System.out.println("Saldo: ");
			float saldo = sc.nextFloat();
			//Creo un objeto de la clase cuenta nomina
			CuentaNomina cuentaNomina = new CuentaNomina(numCuenta, dni, saldo);
			cuentas [numCuentas] = cuentaNomina;
			numCuentas++;
			
			System.out.println("\nAlta de cuenta nómina correctamente realizada");

		}else {
			System.out.println("ERROR. Tope de cunetas");
		}
		return numCuentas;
	}
//creo el metodo en el que muestro los datos de las cuentas, tanto corriente como nomina	
	private static void mostrarCuentas(final Cuenta[] cuentas, int numCuentas) {
//Recorro el array en su busca y luego las muestro 		
		for (int i = 0; i < numCuentas; i++) {
		    System.out.println("\n" + (i + 1) + ". " + cuentas[i].mostrar());
		}
	}	
//Creo el método ingresar, pidiendo la info. de la cuenta al usuario y leyéndola
	private static void ingresar(Scanner sc, final Cuenta[] cuentas, int numCuentas) {
		mostrarCuentas(cuentas, numCuentas);  //muestro los datos de las cuentas
		System.out.print("Introduce el número de cuenta: ");
		int numCuenta = sc.nextInt();

		System.out.print("Introduce el importe a ingresar: ");
		float importe = sc.nextFloat();
//Recorro el array para ver si la cuenta ingresada por el usuario esta en el array, y si esta calcular el ingreso
		for (int i = 0; i < numCuentas; i++) {
		    if (cuentas[i].getNumeroCuenta() == numCuenta) {
		        cuentas[i].ingresar(importe);
		        System.out.println("Saldo actualizado: \n" + cuentas[i].mostrar());
		        break;
		    }
		}
	}	
	//Creo el método retirar, pidiendo la info. de la cuenta al usuario y leyéndola
	private static void retirar(Scanner sc, final Cuenta[] cuentas, int numCuentas) {
		mostrarCuentas(cuentas, numCuentas);
		System.out.print("Introduce el número de cuenta: ");
		int numCuenta1 = sc.nextInt();

		System.out.print("Introduce el importe a retirar: ");
		double importe1 = sc.nextDouble();
		
//        	cuentas [numCuenta1 - 1].ingresar(importe1);
//        	mostrarCuentas(cuentas, numCuentas);
		
	//Recorro el array para ver si la cuenta ingresada por el usuario esta en el array, y asi calcular el retiro, mostrando la cuenta actualizada
		for (int i = 0; i < numCuentas; i++) {
		    if (cuentas[i].getNumeroCuenta() == numCuenta1) {
		        cuentas[i].retirar(importe1);
		        System.out.println("Saldo actualizado: " + " \n " + cuentas[i].mostrar());
		        break;
		    }
		}
	}
}