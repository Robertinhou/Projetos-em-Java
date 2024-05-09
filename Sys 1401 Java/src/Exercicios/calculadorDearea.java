package Exercicios;
import java.util.Scanner;

public class calculadorDearea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da base do retângulo Trapézio");
        Double b = sc.nextDouble();
        System.out.println("Insira o valor da base maior do retângulo Trapézio");
        Double B = sc.nextDouble();
        System.out.println("Insira o valor da altura do retângulo Trapézio");
        Double h = sc.nextDouble();

        Double area = (b+B) / 2 * h;
        System.out.println("A área do retângulo trapézio é: "+area);

    }


}
