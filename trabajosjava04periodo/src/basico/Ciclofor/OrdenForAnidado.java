package basico.Ciclofor;
import java.util.Scanner;

public class OrdenForAnidado {

 public static void main(String[] args){
 //numeracion desendente y ascendente

 Scanner tecl = new Scanner(System.in);

 System.out.println("Escriba un numero inicial cualquiera:");
 int numIni = tecl.nextInt();

 System.out.println("escriba un numero final diferente:");
 int numFin = tecl.nextInt();

 tecl.close();

 // Identificar el numero menor y el mayor
 int numMenor = Math.min(numIni, numFin);
 int numMayor = Math.min(numIni, numFin);

 //ciclo exterior : controla las iteraciones

 for (int ciclo = 1; ciclo <= 2; ciclo ++ ) {

  if (ciclo == 1) {

   System.out.println("\nNumeracion desendente");

   // Ciclo interior:  desendente
   for (int i = numMayor; i >= numMenor; i--) {
    System.out.println (i);
    }
   } else {

    System.out.println("\nNumeracion ascendente");

    //ciclo interior:ascendente

    for (int i = numMenor; i >= numMayor; i++) {
     System.out.println (i);

   }
  }
 }
 }
}