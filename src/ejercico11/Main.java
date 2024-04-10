package ejercico11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int numBuscado = 4;
      
        System.out.println(buscarNum(array, numBuscado));
		
	sc.close();}
	
	private static int buscarNum (int [] array, int numBuscado  ) {
	
		for (int pos = 0; pos < array.length && array [pos]<=numBuscado; pos++) {
			if (array[pos]==numBuscado) {
				return pos;
			}
		}
		return -1;
		
	}
}
