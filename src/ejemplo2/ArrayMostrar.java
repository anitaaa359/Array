package ejemplo2;

public class ArrayMostrar {

	public static void main(String[] args) {
		int [] elementos  = new int [10];
		elementos [0]=5;
		elementos [1]=8;
		elementos [2]=44;
		elementos [3]=36;
		elementos [4]=1;
		elementos [5]=7;
		elementos [6]=558;
		elementos [7]=20;
		elementos [8]=0;
		elementos [9]=90;
		
		for (int i=0; i<elementos.length; i++) {
			System.out.println("VISUALIZO LOS ELEMENTOS " + i + "=" + elementos[i]);
		}
	}
}
