package basico.Ciclofor;

import java.util.Scanner;

public class AnimalesPatios {

    public static void main(String[] args) {

        System.out.println("Animales del Zoológico");

        Scanner tecl = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {

            System.out.println("\nAnimales sala " + i);

            for (int j = 1; j <= 3; j++) {

                System.out.print("Diga el animal " + j + ": ");
                String animal = tecl.nextLine();

            }
        }

        tecl.close();
    }
}
