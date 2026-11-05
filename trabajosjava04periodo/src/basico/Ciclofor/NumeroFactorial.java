package basico.Ciclofor;

import java.util.Scanner;

public class NumeroFactorial {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int num = 1;

        while (num != 0) {

            System.out.println("Por favor ingrese un numero (0 para salir):");
            num = tecl.nextInt();

            if (num != 0) {

                int factorial = 1;
                int i = 1;

                while (i <= num) {
                    factorial = factorial * i;
                    i++;
                }

                System.out.println("El factorial del numero es: " + factorial);
            }
        }

        System.out.println("Programa finalizado");
        tecl.close();
    }
}