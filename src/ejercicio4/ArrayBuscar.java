package ejercicio4;

import java.util.Scanner;

public class ArrayBuscar {

	public static void main(String[] args) {
		String caracteres [] = {"A", "C", "D", "Y", "B", "V", "M", "S", "P", "U" + "H"};
		
		Scanner sc = new Scanner (System.in);
		
        System.out.print("Caracter a buscar: ");
        String cadenaBuscada = sc.nextLine();
      
        int posicion = buscarCadena(caracteres, cadenaBuscada);

       
        if (posicion != -1) {
            System.out.println("El caracter'" + cadenaBuscada + "' se encuentra en la posición " + posicion);
        } else {
            System.out.println("El caracter '" + cadenaBuscada + "' no se encuentra en el array.");
	        }
        
	    sc.close();}

		    // Método para buscar 
		    private static int buscarCadena(String[] array, String cadena) {
		    	
		        for (int i = 0; i < array.length; i++) {
		            if (array[i].equals(cadena)) {
		                return i; // Devolver la posición si se encuentra la cadena
		            }
		        }
		        return -1;
		 }
		
}


