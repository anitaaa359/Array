package ejemplo2;

import java.util.Scanner;

public class ArrayNombres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String [] nombres  = new String [10];
		
		for (int i = 0; i < nombres.length; i++) {
            System.out.print(" NOMBRE " + (i + 1) + ": \n");
            nombres[i] = sc.next();
        }
		
		for (String nombre : nombres) {
			System.out.println("Los nombres son: " + nombre);
		}
		
	sc.close();
	}

}
