import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, doble, triple;

        System.out.println("Escribe un numero y se te devolvera el triple y el doble del mismo");
        num = entrada.nextInt();

        doble = 2*num;
        triple = 3*num;

        System.out.println("El doble es " + doble);
        System.out.println("El triple es " + triple);

    }
}