package basico.Ciclofor;

import java.util.Scanner;

public class Ecuacion {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int x;

        System.out.println("Ingrese el valor inicial de X:");
        int inicio = tecl.nextInt();

        System.out.println("Ingrese el valor final de X:");
        int fin = tecl.nextInt();

        x = inicio;

        while (x <= fin) {

            int y = 2 * x * x;

            System.out.println("Cuando X = " + x + " el valor de Y = " + y);

            x++;
        }

        tecl.close();
    }
}