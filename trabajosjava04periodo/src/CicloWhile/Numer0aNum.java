package CicloWhile;

import java.util.Scanner;

public class Numer0aNum {
	

	public static void main (String[] args) {
	
	Scanner tecl = new Scanner (System.in);
	
	int i = 0;
	
	System.out.println(" por favor ingrese un numero");
	int num = tecl.nextInt();
	tecl.close();
	while (i< num) {
		
		System.out.println(i + 1);
		i++;
		
		}
	}

}