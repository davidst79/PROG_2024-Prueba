package vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
	
/*		
		int temperaturas[] = new int[10];
		temperaturas[4] = -2;
		temperaturas[0] = 20;
		temperaturas[1] = 4;
		temperaturas[2] = 23;
		
		String miArray = Arrays.toString(temperaturas);
		System.out.println(miArray);
		
		System.out.println(temperaturas[0]);
		
		System.out.println();
		
		System.out.println(Arrays.toString(temperaturas));
		
		System.out.println(temperaturas.length); // tiene que salir lo que puse en la variable es decir el 10 //
*/	
		
		char frase[] = new char[10];
		
		frase[0] = 'H';
		frase[1] = 'o';
		frase[2] = 'l';
		frase[3] = 'a';
		frase[4] = ' ';
		frase[5] = 'h';
		frase[6] = 'o';
		frase[7] = 'l';
		frase[8] = 'a';
		frase[9] = '!';
		
		
		for(int i = 0; i<frase.length; i++) {
			//System.out.println("pos "+i+" = "+frase[i]);
			System.out.print(frase[i]);
		}
		
		System.out.println();
		
		for(int i = frase.length-1; i>=0; i--) {
			System.out.print(frase[i]);
		}
	
		System.out.println();
		
		for(char letra:frase) {  //los 2 puntos significa que letra pase por todo lo que hay en frase
			System.out.println("bucle avanzado "+letra);
		}
		
		
		
		
		
		
	}

}
