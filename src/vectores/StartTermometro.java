package vectores;

public class StartTermometro {

	public static void main(String[] args) {
		
		
		Termometro termometro = new Termometro(5);
		System.out.println(termometro);
		
		System.out.println();
		
		System.out.println("la maxima temperatura es "+termometro.getMaxima());
		System.out.println("la minima temperatura es "+termometro.getMinima());
		System.out.println("la temperatura media es "+ termometro.getMedia());
		System.out.println("la temperatura media de los dias impares es "+termometro.getMaxDiasPares());
		
		

	}

}
