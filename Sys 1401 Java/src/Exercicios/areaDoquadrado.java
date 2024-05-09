package Exercicios;

import java.util.Scanner;

public class areaDoquadrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da base do quadrado");
        Double b = sc.nextDouble();

        System.out.println("Insira o valor da altura do quadrado");
        Double h = sc.nextDouble();

        Double area = b * h;
        System.out.println("A área do quadrado é: "+area);

    }

}
