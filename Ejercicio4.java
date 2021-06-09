import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int number, square, cube;

        number = entrada.nextInt();

        square = number*number;
        cube = number*number*number;

        System.out.println("El cuadrado del numero ingresado es : " + square);
        System.out.println("El cubo del numero ingresado es :" + cube);






    }
}