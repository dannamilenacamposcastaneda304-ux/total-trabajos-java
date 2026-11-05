package basico.Ciclofor;

import java.util.Scanner;

public class RepetirNombre {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Escriba su nombre:");
        String nombre = tecl.nextLine();

        System.out.println("¿Cuantas veces desea repetir el nombre?");
        int numVeces = tecl.nextInt();

        for (int i = 1; i <= numVeces; i++) {
            System.out.println(i + ". " + nombre);
        }

        tecl.close();
    }
}

