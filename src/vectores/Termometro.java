package vectores;

import java.util.Arrays;

public class Termometro {

	
	private float temperaturas[];
	private int mes;
	private float maxima;
	private float minima;
	private float media;
	private float maximaDiasPares;
	private float mediaDiasImpares;
	
	
	public Termometro(int mes) {
		
		this.mes = mes;
		generarEspacioTemperaturas(mes);
		rellenarTemperaturas(mes);
		
		//calcular las estadisticas
		calculosEstadisticos();
	}

	
	private void calculosEstadisticos() {
		
		this.maxima = -1000;
		this.minima = 1000;
		float suma = 0;
		
		for(int i = 0; i<temperaturas.length; i++) {		//ESTO DE AQUI ES LO
															//MISMO QUE LAS OPRACIONES DE ABAJO
			
			if(temperaturas[i]>this.maxima) {
				this.maxima = temperaturas[i];
			}
			
			if(temperaturas[i]<this.minima) {
				this.minima = temperaturas[i];
			}
			
			suma += temperaturas[i];
			
			if(i%2!=0) {
				
				if(temperaturas[i]>maximaDiasPares) {
					
					maximaDiasPares = temperaturas[i];
				}
			}
			else {
				
				sumaImpares += temperaturas[i];
			}	
		}
		this.media = suma / temperaturas.length;
		this.mediaDiasImpares = sumaImpares / temperaturas.length;
	}
	
	public float getMaxDiasPares() {
		return maximaDiasPares;
	}


	public float getMaxima() {
		// crear una variable y ponerle un valor pequeño
		// buscar los valores de emperatura
			// compararlos con el Max
			// si es mayor guardo la nueva Max
		// devuelvo la max
		
		float maxima = -1000;
		
		for(int i = 0; i<temperaturas.length; i++) {
			
			if(maxima<temperaturas[i]) {
				maxima = temperaturas[i];
			}
		}
		return maxima;
	}
	
	
	public float getMinima() {
		float minima = 1000;
		
		for(int i = 0; i<temperaturas.length; i++) {
			
			if(temperaturas[i]<minima) {
				minima = temperaturas[i];
			}
		}
		return minima;
	}
	
	
	public float getMedia() {
		float suma = 0;
		
		for(int i = 0; i<temperaturas.length; i++) {
			
			suma += temperaturas[i];
		}
		return suma/temperaturas.length;
	}
	
	



	private void generarEspacioTemperaturas(int mes) {
		switch(mes) {
		
			case 1,3,5,7,8,10,12:
				temperaturas = new float[31];
				break;
				
			case 4,6,9,11:
				temperaturas = new float[30];				
				break;
				
				
			case 2:
				temperaturas = new float[28];		
				break;
				
			default:
				temperaturas = new float[31];
				this.mes = 1;
				break;
		}
	}

	
	private void rellenarTemperaturas(int mes) {
		for(int i = 0; i<temperaturas.length; i++) {
			
			switch(mes) {
			
			case 1, 2 ,12:
				temperaturas[i] = (float)(Math.random()*18-5);
				break;
				
			case 3, 4, 5:
				temperaturas[i] = (float)(Math.random()*16)+2;
				break;
			
			case 6, 7 , 8:
				temperaturas[i] = (float)(Math.random()*14+15);
				break;
				
			case 9, 10, 11:
				temperaturas[i] = (float)(Math.random()*15+8);			
			}
		}
	}

	
	
	
	
	@Override
	public String toString() {
		return "Termometro {" +Arrays.toString(temperaturas) + "]|\n"
				+ "max ("+maxima+")\n"
				+ "min ("+minima+")\n"
				+ "med ("+media+")\n";
				
	}
	
	
	
	
}
