package insertarEliminar;

import java.util.Scanner;

public class InsertarEliminar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame la cantidad de alumnos en la lista: ");
		int lista = sc.nextInt();
		 
		Alumn [] alumnos = new Alumn [lista];
		
		
		int opcion;
		
		do {
            System.out.println("\nMenú:");
            System.out.println("1. Alta de alumno");
            System.out.println("2. Baja de alumno");
            System.out.println("3. Listar alumnos");
            System.out.println("4. Finalizar");

            System.out.print("Seleccione una opción (1-4): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
				Alumn.altaAlumnos(sc, alumnos);
				break;
                   
                                      
                case 2:
                	
				Alumn.bajaAlumno(sc, alumnos);     
                break;
                    
                case 3:
                	
				Alumn.listaAlumnos(alumnos);
				break;
                    
                case 4:
				Alumn.fin();
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            
        }while (opcion !=4 );
		
    sc.close();}	
}
