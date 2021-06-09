import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, imp;
        System.out.println("Ingresa un numero y se te devolverá el mismo numero mas 1");

        num = entrada.nextInt();

        imp = num + 1;

        System.out.println("El numero mas 1 del numero ingresado es: " + imp);


    }
}