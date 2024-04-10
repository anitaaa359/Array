package ejercicio6;

import java.util.Random;
import java.util.Scanner;

public class ArrayBarraja {
	
	    private int[] numeros;

	    public ArrayBarraja() {
	        numeros = new int[10];
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = 0;
	        }
	    }

	    public void pedirNumeros() {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        for (int i = 0; i < numeros.length; i++) {
	        	
	            System.out.print("Introduce el valor en la posición " + i + ": ");
	            numeros[i] = sc.nextInt();
	        }
	    sc.close();}

	    public void leerNumeros() {
	    	
	        System.out.print("Valores del array: ");
	        
	        for (int num : numeros) {
	            System.out.print(num + " ");
	        }
	    }

	    public void barajarNumeros() {
	    	
	        Random random = new Random();
	        
	        for (int i = 0; i < numeros.length; i++) {
	        	
	            int indice1 = random.nextInt(numeros.length);
	            int indice2 = random.nextInt(numeros.length);

	            // Intercambio en los indices de los números
	            int temporal = numeros[indice1];
	            
	            numeros[indice1] = numeros[indice2];
	            numeros[indice2] = temporal;
	        }
	    }

	    public static void main(String[] args) {
	    	
	        ArrayBarraja a = new ArrayBarraja();
	        a.pedirNumeros();

	        System.out.println("\nElementos antes de barajar:");
	        a.leerNumeros();

	        a.barajarNumeros();

	        System.out.println("\n\n\nElementos después de barajar:");
	        a.leerNumeros();
	    }
	}
