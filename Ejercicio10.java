import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int perimetro, area, base, altura;

        System.out.println("Escribe la base y altura de un cuadrado");
        base = entrada.nextInt();
        altura = entrada.nextInt();

        area = base * altura;
        perimetro = 2*base + 2*altura;

        System.out.println("El area es " + area);
        System.out.println("El perimetro es " + perimetro);
    }
}