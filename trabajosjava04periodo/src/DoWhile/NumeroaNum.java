package DoWhile;

import java.util.Scanner;

public class NumeroaNum {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero entero:");
        int num = tecl.nextInt();

        int i = 1;

        while (num > 0) {

            int unidad = num % 10;

            System.out.println(unidad);

            num = num / 10;
            i++;
        }

        tecl.close();
    }
}