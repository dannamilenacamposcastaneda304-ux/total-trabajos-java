package basico.Ciclofor;

import java.util.Scanner;

public class SumarCifras {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        int suma = 0;
        int num;
        int cantidad;
        int i = 1;

        System.out.println("Por favor ingrese la cantidad de numeros que desea sumar:");
        cantidad = tecl.nextInt();

        while (i <= cantidad) {

            System.out.println("Ingrese el numero " + i + ":");
            num = tecl.nextInt();

            suma = suma + num;

            i++;
        }

        System.out.println("La suma total es: " + suma);

        tecl.close();
    }
}