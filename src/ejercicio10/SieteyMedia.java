package ejercicio10;

import java.util.Random;
import java.util.Scanner;

public class SieteyMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 

		Random random = new Random ();
		
		String[] cartas = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
        double[] valores = {1, 2, 3, 4, 5, 6, 7, 0.5, 0.5, 0.5};

        double sumaPersona = 0;
        double sumaAleatoria = 0;
        
        System.out.println("JUEGO DE CARTAS DE 7 Y MEDIA " );
        
        while (true) {
            int opcionUsuario;
              
            System.out.println("\n¿Quieres otra carta? (0 es NO, 1 es SÍ): ");
            opcionUsuario = sc.nextInt();

            if (opcionUsuario == 1) {
                int indiceCarta = random.nextInt(cartas.length);
                System.out.println("Has elegido una carta: " + cartas[indiceCarta]);
                sumaPersona += valores[indiceCarta];
                System.out.println("Su suma es de: " + sumaPersona + "\n");

                if (sumaPersona > 7.5) {
                    System.out.println("¡HAS PERDIDO ! Te has pasado de 7.5.");
                    return;
                }
            } else {
            	 while (sumaAleatoria < 7.5 && sumaAleatoria <= sumaPersona) {
                     int indiceCarta = random.nextInt(cartas.length);
                     System.out.println("\nEl grupier ha elegido una carta: " + cartas[indiceCarta]);
                     sumaAleatoria += valores[indiceCarta];
                     System.out.println("Su suma es de: " + sumaAleatoria + "\n");
                 }

                 
                 System.out.println("\nTu suma total de cartas es de: " + sumaPersona);
                 System.out.println("La suma total del crupier es de: " + sumaAleatoria);
                 
                 if (sumaPersona <= 7.5 && (sumaAleatoria > 7.5 || sumaPersona > sumaAleatoria)) {
                     System.out.println("¡\nHAS GANADO! ENHORABUENA");
                 } else {
                     System.out.println("\n¡GAME OVER!");
                 } return;
            }
        }
    }
}
        	