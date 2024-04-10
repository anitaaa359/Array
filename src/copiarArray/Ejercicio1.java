package copiarArray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int [] array1 = {3, 10, 5, 7, 14, 20, 83};
		
		System.out.println("Dame la posición inicial: ");
		int posiInicial = sc.nextInt();
		
		System.out.println("Dame la posicion final: ");
		int posiFinal = sc.nextInt();
		
		int[] array2 = Arrays.copyOfRange(array1, posiInicial, posiFinal + 1);
		System.out.println("3º array: " + Arrays.toString(array2));
		
		int[] array3 = Arrays.copyOf(array1, array1.length);
		
		System.out.print("\nDame un número para el 3º array: ");
		int numUsuario = sc.nextInt();
		Arrays.fill(array3, numUsuario);
		
		System.out.println("\nComparación entre el Primer y Segundo Array: " + Arrays.equals(array1, array2));
		System.out.println("Comparación entre el Primer y Tercer Array: " + Arrays.equals(array1, array3));
		
	sc.close();
	
	}
}   
