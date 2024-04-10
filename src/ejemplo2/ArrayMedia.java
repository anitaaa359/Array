package ejemplo2;

import java.util.Scanner;

public class ArrayMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		float [] numeros  = new float [10];
		
		for (int i = 0; i < numeros.length; i++) {
            System.out.print(" NÚMEROS " + (i + 1) + ": \n");
            numeros[i] = sc.nextFloat();
        }
		
		float suma = 0;
		for (float numero : numeros) {
			suma += numero;
		}
		float media = (suma / numeros.length) ;
		System.out.println("La media de los números son: " + media);
		
	sc.close();
	}
}
