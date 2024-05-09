package Exercicios;

import java.util.Scanner;

public class area_retangulo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



        System.out.println("Escreva a primeira base : ");
         Double b = sc.nextDouble();
        System.out.println("Escreva a segunda base :");
        Double b1 = sc.nextDouble();
        System.out.println("Escreva a altura :");
        Double h = sc.nextDouble();
        Double soma = (b+b1) /2 * h;
        System.out.println("A areá do retangulo é : " + soma);
    }
}
