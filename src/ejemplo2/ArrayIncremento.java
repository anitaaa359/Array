package ejemplo2;

import java.util.Scanner;

public class ArrayIncremento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double [] numeros  = new double [10];
		
		for (int i = 0; i < numeros.length; i++) {
            System.out.print(" NÚMEROS " + (i + 1) + ": \n");
            numeros[i] = sc.nextDouble();
        }
		
		System.out.println("Dame el porcentaje: ");
		int porcentaje = sc.nextInt();
		
		double suma = 0; 
		for (double numero : numeros) {
			suma += numero; 
			System.out.println(numero);
			}
		
		double resultado = (suma * porcentaje)/100;
		
		System.out.println("El resultado de los números son: " + resultado);
	
	sc.close();
	}
}
