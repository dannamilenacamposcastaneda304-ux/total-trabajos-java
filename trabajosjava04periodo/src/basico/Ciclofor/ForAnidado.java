package basico.Ciclofor;
import java.util.Scanner;
public  class ForAnidado {
	
	public static void main (String [] args) {
		
		// escribir de manera ascente y descente en un rango 
		Scanner tecl = new Scanner (System.in);
		
		int numMayor, numMenor ; 
		
		System.out.println("Escriba un numero inicial");
		int numIni = tecl.nextInt();
		
		System.out.println("Escriba un numero final");
		int numFin = tecl.nextInt();
		
		tecl.close();
		
		if (numIni < numFin) {
		
		numMenor = numIni;
		numMayor = numFin;
	
	    } else {
		
		numMenor = numFin;
		numMayor = numIni;
		
	}
	
	System.out.println("Numeracion descendente");
	
	for (int i = numMayor;  i >= numMenor; i--) {
		
		System.out.println(i);
		
	}
	
	System.out.println("\nNumeracion ascendente");
	
	 for (int i = numMenor; i <= numMayor; i++) {
		 
	 }
	}
}
		