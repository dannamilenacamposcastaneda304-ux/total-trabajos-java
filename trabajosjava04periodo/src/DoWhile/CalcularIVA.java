package DoWhile;
import java.util.Scanner;

public class CalcularIVA {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        double precio;
        double iva;
        double total;
        double totalGeneral = 0;

        System.out.println("CALCULO DEL IVA");

        System.out.println("Ingrese el precio del producto (0 para finalizar):");
        precio = tecl.nextDouble();

        while (precio != 0) {

            iva = precio * 0.19;
            total = precio + iva;

            System.out.println("Precio del producto: " + precio);
            System.out.println("IVA (19%): " + iva);
            System.out.println("Costo total: " + total);

            totalGeneral = totalGeneral + total;

            System.out.println("-------------------------");

            System.out.println("Ingrese el precio del siguiente producto (0 para finalizar):");
            precio = tecl.nextDouble();
        }

        System.out.println("El costo total de todos los productos es: " + totalGeneral);

        System.out.println("Fin del programa");

        tecl.close();
    }
}