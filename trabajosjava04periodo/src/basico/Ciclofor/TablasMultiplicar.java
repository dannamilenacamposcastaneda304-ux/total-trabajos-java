package basico.Ciclofor;

public class TablasMultiplicar {

    public static void main(String[] args) {

        int num = 1;
        int i = 1;

        while (num <= 10) {

            System.out.println("Tabla del " + num);

            i = 1;

            while (i <= 10) {

                System.out.println(num + " x " + i + " = " + (num * i));

                i++;
            }

            System.out.println();

            num++;
        }
    }
}