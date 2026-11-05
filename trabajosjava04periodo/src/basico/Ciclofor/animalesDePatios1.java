package basico.Ciclofor;
import java.util.Scanner ;
public class animalesDePatios1 {
 public static void main(String[] args) {

 System.out.println("Animales del Zoológico");

 Scanner tecl=  new Scanner(System.in);

 System.out.println("el zoológico tiene dos salas");

 System.out.println("\nIndique el numero de animales de la sala 1");

 int animSala1 = tecl.nextInt();

 System.out.println("Indique el numero de animales de la sala 2");

 int animSala2= tecl.nextInt();

 tecl.nextLine();

 for (int i=1; i < animSala1; i++) {

 System.out.println("\nAnimales sala " + i );

 for (int j = 1; j <= animSala2; j++) {

 System.out.println("Diga el animal " +j+"");
 String animal =tecl.nextLine();

   }

   System.out.println("este programa no imprime los animales");
  }
  tecl.close();
 }
}


    

      
