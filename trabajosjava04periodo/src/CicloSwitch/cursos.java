package CicloSwitch;

import java.util.Scanner;

public class cursos {

    public static void main(String[] args) {

        Scanner tecl = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre:");
        String nombre = tecl.nextLine();

        System.out.println("Ingrese su comuna:");
        String comuna = tecl.nextLine();

        System.out.println("Ingrese su barrio:");
        String barrio = tecl.nextLine();

        System.out.println("Si ingresa a sexto escriba 6");
        System.out.println("Si ingresa a septimo escriba 7");
        System.out.println("Si ingresa a octavo escriba 8");
        System.out.println("Si ingresa a noveno escriba 9");
        System.out.println("Si ingresa a decimo escriba 10");
        System.out.println("Si ingresa a once escriba 11");

        System.out.println("Escriba el numero asociado al curso:");
        int curso = tecl.nextInt();

        System.out.println("\nNombre: " + nombre);
        System.out.println("Comuna: " + comuna);
        System.out.println("Barrio: " + barrio);

        switch (curso) {

            case 6:
                System.out.println("Curso: Sexto");
                System.out.println("Segundo piso, bloque academico");
                System.out.println("Salones 201, 202 y 203");
                break;

            case 7:
                System.out.println("Curso: Septimo");
                System.out.println("Tercer piso, bloque academico");
                System.out.println("Salones 301, 302 y 303");
                break;

            case 8:
                System.out.println("Curso: Octavo");
                System.out.println("Segundo y tercer piso, bloque academico");
                System.out.println("Salones 204, 304 y 205");
                break;

            case 9:
                System.out.println("Curso: Noveno");
                System.out.println("Cuarto piso, bloque academico");
                System.out.println("Salones 401, 402 y 403");
                break;

            case 10:
                System.out.println("Curso: Decimo");
                System.out.println("Cuarto piso y segundo bloque academico");
                System.out.println("Salones 406, 404 y 405");
                break;

            case 11:
                System.out.println("Curso: Once");
                System.out.println("Primer piso del segundo bloque academico");
                System.out.println("Salones 506, 508 y 509");
                break;

            default:
                System.out.println("Lo sentimos, ingreso un valor incorrecto.");
        }

        System.out.println("Que tenga un hermoso dia.");

        tecl.close();
    }
}