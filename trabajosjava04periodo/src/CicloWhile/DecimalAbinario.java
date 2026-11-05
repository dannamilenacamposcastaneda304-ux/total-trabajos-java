package CicloWhile;
import java.util.Scanner;
public class DecimalAbinario {
	
	public static void main (String []args) {
		
		Scanner tecl = new Scanner (System.in);
		
		System.out.println("Ingrese un numero decimal entero");
		int numDecimal = tecl.nextInt();
		int numDecimal1 = numDecimal;
		
		String numBinario = ""; //Es parecido a decir que inicia en cero 
		                        // pero que no esta vacio 
		
		while (numDecimal > 0) {
			numBinario = numDecimal % 2 + numBinario;
			//la operacion tiene 2 partes 
			// en la primera obtenemos el resto del numero decimal 
			// y la segunda concatenamos 
		numDecimal /= 2; //numDecinal = numDecinal / 2
		}
		System.out.println(numDecimal + " en Binario es "+ numBinario);
	}

}
