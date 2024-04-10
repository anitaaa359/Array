package ejercicio9;

import java.util.Scanner;

public class ArrayPrimos {

	    public static void main(String[] args) {
	      
	        int numeros[] = new int[10];
	        int primos[] = new int[10];
	        int numPrimos = 0;
	        
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Introduce 10 números:");
	        for (int i = 0; i < 10; i++) {
	            numeros[i] = sc.nextInt();
	        }

	        for (int i = 0; i < 10; i++) {
	            if (esPrimo(numeros[i])) {
	                primos[numPrimos] = numeros[i];
	                numPrimos++;
	            }
	        }
	     
	        System.out.println("Los números primos son:");
	        for (int i = 0; i < numPrimos; i++) {
	            System.out.println(primos[i]);
	        }
	    sc.close();}

	 
	    private static boolean esPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
		

