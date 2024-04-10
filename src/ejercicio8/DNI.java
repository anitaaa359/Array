package ejercicio8;

import java.util.Scanner;

public class DNI {

   public static String calcularLetraDNI(int dniNumeros) {
        
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = dniNumeros % 23;

        char letra = letrasDNI[resto];

        return String.valueOf(dniNumeros) + letra;
    }
    
    
  public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame DNI (sin letra): ");
        int dniNumeros = sc.nextInt();
        
        String dniCompleto = calcularLetraDNI(dniNumeros);
        
        System.out.println("DNI completo: " + dniCompleto);
        
        sc.close();}
  
}
