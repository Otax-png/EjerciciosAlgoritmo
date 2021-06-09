import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numCm;
        double valYarda, valMetro, valPie, valPlg;

        numCm = entrada.nextInt();

        valYarda = numCm * (1/91.44);
        valMetro = numCm * (1/100);
        valPie = numCm *(1/39.5);
        valPlg = numCm * (1/2.5);

        System.out.println(numCm + "cm equivalen a: " + valYarda + "yd " + valMetro + "m " + valPie +
        " ft " + valPlg + "plg");

    }
}