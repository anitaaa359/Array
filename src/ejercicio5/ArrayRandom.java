package ejercicio5;

import java.util.Random;

public class ArrayRandom {
	
	 int[] numeros = new int [10];

	     public void numAleatorios() {
	    	 
	         Random random = new Random();
	         
	         for (int i = 0; i < numeros.length; i++) {
	             numeros[i] = random.nextInt(26); 
	         }
	     }

	     // Método para encontrar el 15 y leerlo
	     public void adivinarNum() {
	    	 
	         for (int i = 0; i < numeros.length; i++) {
	        	 
	             if (numeros[i] == 15) {
	                 System.out.println("El 15 se encuentra en la posición " + i + ".");
	                 return;
	             }
	         }
	         
	         System.out.println("El 15 no se encuentra en el array.");
	     }

	     public static void main(String[] args) {
	         
	         ArrayRandom a = new ArrayRandom();	        
	         a.numAleatorios();

	         System.out.print("Array inicializado: ");
	         
	         for (int elemento : a.numeros) {
	             System.out.print(elemento + " ");
	         }
	         
	         System.out.println();
	         a.adivinarNum();
	     }	
}



