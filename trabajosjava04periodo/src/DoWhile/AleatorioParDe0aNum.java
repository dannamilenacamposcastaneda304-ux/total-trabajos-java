package DoWhile;

public class AleatorioParDe0aNum {

	public static void main (String []args) {
		// numero aleatorio par menor que valor 
		
		int num = 20; 
		int aleatorio,i;
		i=0;
		do { // si el primer valor es impar de todos modos se ejecuta 
			aleatorio = (int) (Math.random()* num);
			// math random es un numero es un numero entre 0 y 1 
			// al multiplicarlo por el valor maximo da un valor decimal menor 
			//Al Hacer casting a entero se elimina la parte decimal 
			System.out.println(aleatorio);
			i++;
			
		} while(aleatorio %2 != 0);// mientras el valor sea impar se repite 
		
		System.out.println("En " + i + "iteraciones");
	}
}
