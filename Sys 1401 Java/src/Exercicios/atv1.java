package Exercicios;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        int conta;

        Scanner leia = new Scanner(System.in);


        System.out.println("Insira o primeiro número");
        int numero1 = leia.nextInt();
        System.out.println("Insira o segundo número");
        int numero2 = leia.nextInt();
        System.out.println("Insira o terceiro número");
        int numero3 = leia.nextInt();
        System.out.println("Insira o quarto número");
        int numero4 = leia.nextInt();
        System.out.println("Insira o quinto número");
        int numero5 = leia.nextInt();

        conta = (numero1+numero2+numero3+numero4);
        Double soma = new Double(conta);
        System.out.printf("O valor é: %.2f%n", soma/5);

    }
}
