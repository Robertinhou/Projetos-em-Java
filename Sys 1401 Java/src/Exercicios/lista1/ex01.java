import java.util.Scanner;


public class ex01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i;
        double soma;
        double [] notas = new double[4];
        soma = 0;
        for(i = 0; i < 4; i++){
            System.out.print("Digite a "+ (i+1) +" ° nota: ");
            notas[i] = sc.nextDouble();
            soma = soma + notas[i]; 
        }
        System.out.println("A nota é: "+ soma );
    }
}