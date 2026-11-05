package basico.Ciclofor;

import java.util.Scanner;

public class RepetirNumer {

    public static void main(String[] args) {

        // Programa de cuenta regresiva del mayor al menor

        Scanner tecl = new Scanner(System.in);

        System.out.println("Ingrese el numero menor (entre 1 y 100):");
        int numMenor = tecl.nextInt();

        System.out.println("Ingrese el numero mayor (entre 1 y 100):");
        int numMayor = tecl.nextInt();

        for (int i = numMayor; i >= numMenor; i--) {
            System.out.println(i);
        }

        tecl.close();
    }
}

