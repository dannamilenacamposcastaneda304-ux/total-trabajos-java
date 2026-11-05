package basico.Ciclofor;

import java.util.Scanner;

public class MultiplosDeTres {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero hasta 100:");
        int num = tecl.nextInt();

        int i = 3;

        while (i <= num && i <= 100) {

            System.out.println(i);

            i = i + 3;
        }

        tecl.close();
    }
}