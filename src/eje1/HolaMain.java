package eje1;

public class HolaMain {

	public static void main(String[] args) {

		if (args.length == 0) {
            System.out.println("Error, debes pasar un nombre como argumento.");
        } else {
            for (String name : args) {
            	System.out.println("Hola " + name);
            }
	   }

	}

}
