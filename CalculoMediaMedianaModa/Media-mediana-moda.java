/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetomedia;
import java.util.Scanner;
import java.lang.Float;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Robert Rodrigues
 */
public class Projetomedia {

    public static void main(String[] args) {
        
        
        
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Escolha a operação: [1]Média ; [2]Mediana ; [3]Moda");
        Float escolha = input.nextFloat();//input que recebe a escolha
        
        if (escolha == 1){ //se o usuario digita 1 o programa executa esse bloco - calculo de media
        
        System.out.println("Insira um número: ");
        
        Float num1 = input.nextFloat(); //recebe o primeiro numero
        
        System.out.println("Insira outro número: ");
        
        Float num2 = input.nextFloat(); //recebe o segundo numero
        
        System.out.println("Insira outro número: ");
        Float num3 = input.nextFloat(); //recebe o terceiro numero
        
        Float media = (num1+num2+num3)/3; //Formula de calculo de media
        
        System.out.println("A média é: "+media);
        
        } else if (escolha == 2){ //se o usuario digita 2 o programa executa esse bloco - calculo de mediana
        
        System.out.println("Insira um número: "); 
        
        Float num1 = input.nextFloat();//recebe o valor de num1
        
        System.out.println("Insira outro número: ");
        
        Float num2 = input.nextFloat();//recebe o valor de num2
        
        System.out.println("Insira outro número: ");
        Float num3 = input.nextFloat(); //recebe o valor de num3
        // Coloque os números em um array para facilitar a ordenação
        double[] numeros = { num1, num2, num3 };

        // Ordene os números em ordem crescente
        Arrays.sort(numeros);

        // A mediana é o valor do meio
        
        System.out.println("A mediana é: "+numeros[1]); // retorna o indice um da array, no caso o do meio
        
        } else if(escolha == 3){
            System.out.println("Insira um número: ");
        
        Float num1 = input.nextFloat(); // recebe o valor de num1
        
        System.out.println("Insira outro número: ");
        
        Float num2 = input.nextFloat();// recebe o valor de num2
        
        System.out.println("Insira outro número: ");
        Float num3 = input.nextFloat(); // recebe o valor de num3
            // Cria um array de floats para armazenar os três números
            float[] vet = {num1, num2, num3};
             // Cria um array de contadores para cada número
            int[] cont = new int[3];
             // Variáveis para armazenar a quantidade de vezes que um número aparece e o índice correspondente
            int vezes = 0;
            int indice = 0;
             // Loop para comparar cada número com todos os outros
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (vet[i] == vet[j]) {
                        cont[i] = cont[i] + 1;
                    }
                }
            }
            // Inicializa a variável vezes com a contagem do primeiro número
            vezes = cont[0];
            // Loop para encontrar o número com maior contagem
            for (int i = 0; i < cont.length; i++) {
                if (cont[i] > vezes) {
                    vezes = cont[i];
                    indice = i;
                }
            }
            // Retorna o número que apareceu com mais frequência (moda)
            System.out.println("A moda é: "+vet[indice]);
        } 
        
        while (escolha > 3 || escolha < 1){ // se o usuario não digitar nenhum número, 1, 2 ou 3 na escolha retorna isso
             System.out.println("Escolha a operação: [1]Média ; [2]Mediana ; [3]Moda");
        escolha = input.nextFloat();//input que recebe a escolha
        
        if (escolha == 1){ //se o usuario digita 1 o programa executa esse bloco - calculo de media
        
        System.out.println("Insira um número: ");
        
        Float num1 = input.nextFloat(); //recebe o primeiro numero
        
        System.out.println("Insira outro número: ");
        
        Float num2 = input.nextFloat(); //recebe o segundo numero
        
        System.out.println("Insira outro número: ");
        Float num3 = input.nextFloat(); //recebe o terceiro numero
        
        Float media = (num1+num2+num3)/3; //Formula de calculo de media
        
        System.out.println("A média é: "+media);
        
        } else if (escolha == 2){ //se o usuario digita 2 o programa executa esse bloco - calculo de mediana
        
        System.out.println("Insira um número: "); 
        
        Float num1 = input.nextFloat();//recebe o valor de num1
        
        System.out.println("Insira outro número: ");
        
        Float num2 = input.nextFloat();//recebe o valor de num2
        
        System.out.println("Insira outro número: ");
        Float num3 = input.nextFloat(); //recebe o valor de num3
        // Coloque os números em um array para facilitar a ordenação
        double[] numeros = { num1, num2, num3 };

        // Ordene os números em ordem crescente
        Arrays.sort(numeros);

        // A mediana é o valor do meio
        
        System.out.println("A mediana é: "+numeros[1]); // retorna o indice um da array, no caso o do meio
        
        } else if(escolha == 3){
            System.out.println("Insira um número: ");
        
        Float num1 = input.nextFloat(); // recebe o valor de num1
        
        System.out.println("Insira outro número: ");
        
        Float num2 = input.nextFloat();// recebe o valor de num2
        
        System.out.println("Insira outro número: ");
        Float num3 = input.nextFloat(); // recebe o valor de num3
            // Cria um array de floats para armazenar os três números
            float[] vet = {num1, num2, num3};
             // Cria um array de contadores para cada número
            int[] cont = new int[3];
             // Variáveis para armazenar a quantidade de vezes que um número aparece e o índice correspondente
            int vezes = 0;
            int indice = 0;
             // Loop para comparar cada número com todos os outros
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (vet[i] == vet[j]) {
                        cont[i] = cont[i] + 1;
                    }
                }
            }
            // Inicializa a variável vezes com a contagem do primeiro número
            vezes = cont[0];
            // Loop para encontrar o número com maior contagem
            for (int i = 0; i < cont.length; i++) {
                if (cont[i] > vezes) {
                    vezes = cont[i];
                    indice = i;
                }
            }
            // Retorna o número que apareceu com mais frequência (moda)
            System.out.println("A moda é: "+vet[indice]);
        } else{ // se o usuario não digitar nenhum número, 1, 2 ou 3 na escolha retorna isso
            System.out.println("Insira uma opção válida!!");
        }
      
        }
}
       
}
    