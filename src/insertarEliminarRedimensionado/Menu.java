package insertarEliminarRedimensionado;
/*
 * Creación de un array con los modulos de un ciclo insertados por un usuario.
 * Creación de un menú con 3 opciones (insertar, borrra y salir) con su correspondiente función
 * 
 * @author Ana Mª Grad
 * @version 1.0  10/02/2024
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	
	// Declaración del escaner y del array como estaticos para no crear muchas instancias
    static Scanner sc = new Scanner(System.in);
    static String[] modulos = new String[0];

    public static void main(String[] args) {

        int opcion;
        
//Inicialización del bulcle do-while 
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar módulo");
            System.out.println("2. Borrar módulo");
            System.out.println("3. Salir");
            
            System.out.print("\nIngrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
            
                case 1:
                    insertarModulo(sc);
                    break;
                    
                case 2:
                    borrarModulo(sc);
                    break;
                    
                case 3:
                    salir();
                    break;
                    
                default:
                    System.out.println("Opción no valida. Inténtelo otra vez. ");
            }

        } while (opcion != 3);
    }

    // Creación del método Insertar Modulo
    private static void insertarModulo(Scanner sc) {
        System.out.println("\nInserte el modulo: "); 	
        String modulo = sc.next();
        
        Arrays.sort(modulos);
        
        //Buscaa la posición del módulo insertado por el usuario
        int pos = Arrays.binarySearch(modulos, modulo);

        // Si el módulo existe o no 
        if (pos > -1)
            System.out.println("Modulo ya existe");
        
        else {
            String[] arrayTemp = new String[modulos.length + 1]; 	// Array temporal con el módulo nuevo
            System.arraycopy(modulos, 0, arrayTemp, 0, modulos.length); 	//Se copia el array 1 al array temp
            arrayTemp[arrayTemp.length - 1] = modulo;		//Se agrega el ultimo modulo 
            modulos = arrayTemp;
        }
    }
    
    //Creación del método Borrar Modulo
    private static void borrarModulo(Scanner sc) {
    	String[] arrayTemp = new String[modulos.length - 1];
    	
        System.out.print("\nIngrese el módulo a borrar: ");
        
        String moduloABorrar = sc.next();
        
        Arrays.sort(modulos);
        int pos = Arrays.binarySearch(modulos, moduloABorrar);
        if (pos>=0) {
        	
        	  boolean salir =false;
        	  
        	 for (int i= 0; i<modulos.length; i++) {
        		 
             	if (modulos [i].equals(moduloABorrar)) {
             		salir = true;
             		
             	}else {
             		if (!salir) {
             			arrayTemp [i] = modulos[i];
            
             		}else
             			arrayTemp [i-i] = modulos [i];
             		}
             	}
             	modulos = arrayTemp;
        }else 
        	System.out.println("Modulo no encontrado");
}
    

   /*     if (salir = true ) {
            String[] arrayTemp = new String[modulos.length - 1];
            int pos = 0;

            for (int i = 0; i < modulos.length; i++) {
                if (!modulos[i].equals(moduloABorrar)) {
                    arrayTemp[pos] = modulos[i];
                    pos++;
                }
            }

            modulos = arrayTemp;
            System.out.println("Módulo borrado con éxito.");
        } else {
            System.out.println("El módulo no existe en el array.");}
        
        }
*/

/*        
        //Bulce for para buscar el modulo y eliminarlo
        for (int i = 0; i < modulos.length; i++) { 		
            if (modulos[i].equals(moduloABorrar)) { 	//Módulo de la posicion es igual al módulo para borrar
                for (int j = i; j < modulos.length - 1; j++) {		//Bucle para borrar el módulo
                    modulos[j] = modulos[j + 1];	
                }
                salir = true;	//Si se encuentra el módulo y borrado
            }
        }       
        if (salir) {
           modulos = Arrays.copyOf(modulos, modulos.length - 1); // Si se ha borrado elimino la posicion sobrante 
            System.out.println("Módulo borrado con éxito.");
        } else {
            System.out.println("El módulo no existe en el array.");
        }
    }*/
    private static void salir() {
        Arrays.sort(modulos);
        System.out.println("Array ordenado: " + Arrays.toString(modulos));
    }
}

	
	
