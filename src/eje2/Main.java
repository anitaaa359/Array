package eje2;

import java.util.Scanner;

public class Main {
	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        Empleado[] emp = new Empleado[5];
	        int opcion;

	        do {
	            System.out.println("\n1. ALTA");
	            System.out.println("2. CONSULTA");
	            System.out.println("3. SALIR");
	            System.out.print("Ingrese una opción: ");
	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
					altaEmpleado(sc, emp);
					break;
	                    
	                case 2:
					consultarEmpleado(emp);
	                    break;
	                case 3:
	                    System.out.println("¡Hasta Pronto!");
	                    break;
	                default:
	                    System.out.println("Error. Íntentelo de nuevo");
	            }
	        } while (opcion != 3);
	   sc.close(); }

		private static void altaEmpleado(Scanner sc, Empleado[] emp) {
			
			//for (int i = 0; i < emp.length; i++) {
				int i= 0;
			    if /*(emp[i] == null)*/ (i <emp.length) {
			        System.out.print("\n Introduce DNI: ");
			        String dni = sc.next();
			        System.out.print("Introduce nombre: ");
			        String nombre = sc.next();
			        System.out.print("Introduce apellido: ");
			        String apellido = sc.next();
			        System.out.print("Introduce el sueldo: ");
			        float sueldo = sc.nextFloat();

			        emp[i] = new Empleado(dni, nombre, apellido, sueldo);

        	
			    } else //if (i == emp.length - 1) {
			        System.out.println("\nNo puede introducir más altas de empleados. Estamos llenos");
			    }
			//}
//		}

		private static void consultarEmpleado(Empleado[] emp) {
			System.out.println("\nEmpleados:");
			for (Empleado empleado : emp) {
			    if (empleado != null) {
			        System.out.println(empleado);
			    }
			}
		}
}

