package DoWhile;
import java.util.Scanner;

public class CrearContrasena {
    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        String contrasena;
        String repetir;
        String confirmar;

        System.out.println("Ingrese su nueva contraseña:");
        contrasena = tecl.nextLine();

        do {
            System.out.println("Reescriba su contraseña:");
            repetir = tecl.nextLine();

            if (!contrasena.equals(repetir)) {
                System.out.println("Las contraseñas no coinciden.");
            }

        } while (!contrasena.equals(repetir));

        System.out.println("Confirme su contraseña:");
        confirmar = tecl.nextLine();

        do {
            if (!contrasena.equals(confirmar)) {
                System.out.println("Ingrese su contraseña nuevamente:");
                confirmar = tecl.nextLine();
            }
        } while (!contrasena.equals(confirmar));

        System.out.println("Contraseña correcta.");

        tecl.close();
    }
}

