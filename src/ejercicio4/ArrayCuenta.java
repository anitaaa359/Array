package ejercicio4;

import java.util.Scanner;

public class ArrayCuenta {

	    int[] numeros = new int [10];

	    public void pedirNumeros() {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Introduce 10 números enteros (positivos/negativos): ");

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	        }
	        
	    sc.close();
	    }

	    public void sumaNumeros() {
	        int positivos = 0;
	        int negativos = 0;
	        int ceros = 0;

	        for (int numero : numeros) {
	            if (numero > 0) {
	                positivos++;
	            } else if (numero < 0) {
	                negativos++;
	            } else {
	                ceros++;
	            }
	        }

	        System.out.println("Total de números positivos: " + positivos);
	        System.out.println("Total de números negativos: " + negativos);
	        System.out.println("Total de ceros: " + ceros);
	    }

	    public static void main(String[] args) {
	        ArrayCuenta cuenta = new ArrayCuenta();
	        cuenta.pedirNumeros();
	        cuenta.sumaNumeros();
	    }
	}
