package insertarEliminar;

import java.util.Scanner;

public class Alumn {
	
	private String nombre;
    private int edad;
    
  
    public Alumn(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    static void altaAlumnos(Scanner sc, Alumn[] alumnos) {
		boolean salir = false;
		for (int i = 0; i < alumnos.length && salir == false; i++) {
			
		    if (alumnos[i] == null) {
		    	
		    	System.out.print("\nNombre del alumno: ");
		        String nombre = sc.next();
		        
		        System.out.print("Edad del alumno: ");                
		        int edad = sc.nextInt();
		    	
		        alumnos[i] = new Alumn(nombre, edad);
		        System.out.println("Alumno " + nombre + " añadido correctamente.");
		        
		        salir = true;
            
		    }
		  if (i == alumnos.length - 1) {
			  System.out.println("\nNo hay espacio para más alumnos.");
		  }
       }
	}
    
    
    static void bajaAlumno(Scanner sc, Alumn[] alumnos) {
		System.out.print("\nNombre que quierses de dar de baja: ");
		String nom = sc.next();
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNombre().equals(nom)) {
				alumnos[i] = null;
				System.out.println("Alumno " + nom + " dado de baja correctamente.");
				          
		    }else
		    	System.out.println("Alumno " + nom + " no encontrado.");
		}
	}
    
     static void listaAlumnos(Alumn[] alumnos) {
		System.out.println("\nLista de alumnos:");
		 for (Alumn alumno : alumnos) {
		     if (alumno != null) {
		         System.out.println("Nombre: " + alumno.getNombre() + ", Edad: " + alumno.getEdad());
		     }
		 }
	}
    
     static void fin() {
		System.out.println("Hasta pronto");
	}    
}
