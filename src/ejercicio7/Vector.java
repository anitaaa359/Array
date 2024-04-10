package ejercicio7;

import java.util.Scanner;

public class Vector {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el número de elementos del vector: ");        
        int n = sc.nextInt();
        
        System.out.println("Dame valores para el vector: ");
        int maximo = sc.nextInt();
        
        int minimo = maximo;
        
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            
            if (num > maximo) {
                maximo = num;
            } else if (num < minimo) {
                minimo = num;
            }
        }
        System.out.println("El valor más alto del vector es: " + maximo);
        System.out.println("El valor más bajo del vector es: " + minimo);
        
    sc.close();}
}
