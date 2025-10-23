
import java.util.Scanner;

public class Calculadora {
    /**
     *
     */
    public static void main(String[] args) {
        Scanner clcld = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = clcld.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = clcld.nextDouble();

        System.out.println("Mult:" + nota1 * nota2);
        System.out.println("divis:" + nota1 / nota2);
        System.out.println("Soma:" + nota1 + nota2);
        System.out.println("Sub:" + (nota1 - nota2));

     }
}
