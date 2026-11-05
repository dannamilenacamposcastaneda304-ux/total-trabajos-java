package DoWhile;

import java.util.Scanner;

public class NumerosDescendentes {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero mayor:");
        int numMayor = tecl.nextInt();

        System.out.println("Por favor ingrese el numero menor:");
        int numMenor = tecl.nextInt();

        while (numMayor >= numMenor) {

            System.out.println(numMayor);
            numMayor--;

        }

        tecl.close();
    }
}