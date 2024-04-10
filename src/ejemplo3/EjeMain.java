package ejemplo3;

public class EjeMain {

	public static void main(String[] args) {
		
		double numeros [] = {5,2,5,75,48,256,0,1};
		
		// VISUALIZACION DEL ARRAY
		for (double numero : numeros) {
			System.out.println(numero);
			}
		
		System.out.println("La media es: " + calcularMedia(numeros));
		
	}
	
	private static double calcularMedia (double [] numeros ) {
		double suma = 0;
		
		for (double num : numeros) {
			suma += num;
		}
		return suma / numeros.length;
	}

}
