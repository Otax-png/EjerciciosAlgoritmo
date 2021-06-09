import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pais, capital, text;

        pais = scanner.nextLine();
        capital = scanner.nextLine();

        System.out.println(capital + "es la capital de " + pais);

    }

}