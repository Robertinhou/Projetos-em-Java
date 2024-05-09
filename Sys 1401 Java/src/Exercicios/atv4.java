package Exercicios;
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = leia.nextInt();


        System.out.println("A soma é: "+ (numero1+numero2));
    }
}
