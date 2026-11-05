package DoWhile;

import java.util.Scanner;

public class NumeroCuadrado {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int num = 1;

        while (num != 0) {

            System.out.println("Por favor ingrese un numero (0 para salir):");
            num = tecl.nextInt();

            if (num != 0) {
                int cuadrado = num * num;

                System.out.println("El cuadrado del numero es: " + cuadrado);
            }
        }

        System.out.println("Programa finalizado");
        tecl.close();
    }
}