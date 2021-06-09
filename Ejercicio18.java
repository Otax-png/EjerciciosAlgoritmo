import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number, digito1, digito2, digito3, digito4;
        String cade, text;

        System.out.println("Ingresa un numero de 4 digitos");

        number = entrada.nextInt();

        if (number >= 0 && number <10000){

            cade = number + "";

            digito1 = cade.subString(0,1);
            digito2 = cade.subString(1,2);
            digito3 = cade.subString(2,3);
            digito4 = cade.subString(3,4);

            if (number < 10){
                System.out.println("La suma total es " + digito1);
            } else if(number <100) {
                int suma1;
                suma1 = digito1 + digito2;
                System.out.println("la suma total es " + suma1);
            } else if (number < 1000) {
                int suma2;
                suma2 = digito1 + digito2 + digito3;
                System.out.println("La suma total es " + suma2);
            } else if (number < 10000) {
                int suma3;
                suma3 = digito1 + digito2 + digito3 + digito4;

                System.out.println("La suma total es " + suma3);
            } else {
                System.out.println("Numero Fuera de rango");
            }

        } else {
            System.out.println("Numero fuera de rango");
        }

    }
}