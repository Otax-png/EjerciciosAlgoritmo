import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num;
        double result;

        num = ((int)Math.floor(Math.random()*200 - 0 +1) + 0);

        System.out.println("El numero aleatorio generado es: " + num);

        result = num-(num * 0.3);

        System.out.println(result);

    }
}