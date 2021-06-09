import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palabra1, palabra2, aux;

        aux = "a";

        System.out.println("Escriba su primera palabra");
        palabra1 = entrada.nextLine();
        System.out.println("Escriba la segunda palabra");
        palabra2 = entrada.nextLine();
        System.out.println("");

        aux = palabra1;
        palabra1 = palabra2;
        palabra2 = aux;

        System.out.println(palabra1);
        System.out.println(palabra2);

    }
}