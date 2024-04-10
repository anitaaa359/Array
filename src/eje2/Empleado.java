package eje2;

public class Empleado {
	//Creación de variables
	    private String dni;
	    private String nombre;
	    private String apellido;
	    private float sueldo;

//Constructor por defecto
	    public Empleado () {}

//Constructor con paranmetros
		public Empleado(String dni, String nombre, String apellido, float sueldo) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.sueldo = sueldo;
		}

//Getter and Setters
		public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public double getSueldo() {
	        return sueldo;
	    }

	    public void setSueldo(float sueldo) {
	        this.sueldo = sueldo;
	    }
	    
	    
	    public String toString() {
	        return "\nDni: " + dni + "\n Nombre: " + nombre +  "\n Apellido: " + apellido + "\n Sueldo: " + sueldo ;
	    }
}
	