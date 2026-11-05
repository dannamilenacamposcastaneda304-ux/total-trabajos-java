package CicloWhile;
import java.util.Scanner;
public class Numer_N_a_M {
 
	public static void main (String[]args) {
		
		//Nevesitamos 2 variables iniciales 
		
		Scanner tecl = new Scanner (System.in);
		
		System.out.print("Escriba el numero inicial");
		
		int NumInicial = tecl.nextInt();
		System.out.println("Escriba el numero final");
		
		int NumFinal = tecl.nextInt();
		
		while (NumInicial<=NumFinal) {
		System.out.println(NumInicial);
		NumInicial++;
		}
		while (NumInicial<=NumFinal) {
			System.out.println(NumFinal);
			NumFinal++;	
		}
		
	}

}
