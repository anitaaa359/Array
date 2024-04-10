package ejemplo1;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		int [] elementos  = new int [10];
		elementos [0] = 5;
		
		int [] valores = {32,27,64,18,95,14,90,70,60,37};
		
		for (int pos=0; pos<elementos.length; pos++) {
			System.out.println("valores " + pos + "= " + elementos [pos]);
		}
		
		String [] nombres = new String [5];
		nombres [0] = "MARIA";
		nombres [1] = "JUAN";
		nombres [2] = "ANTONIA";
		nombres [3] = "JOSE";
		nombres [4] = "YO";
		
		/**
		 * STRING [] NOMBRES = {"MARIA", "JUAN", "ANTONIA", "JOSE", "YO"};
		 * 			DA NULL
		 */
		
	}

}
