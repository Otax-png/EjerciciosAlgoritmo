public class Ejercicio6 {
    public static void main(String[] args) {
        int num;
        double result;

        num = ((int)Math.floor(Math.random()*100 - 0 +1) + 0);

        System.out.println("El numero aleatorio es " + num);

        result  = num + (num* 0.3);

        System.out.println(result);
    }
}