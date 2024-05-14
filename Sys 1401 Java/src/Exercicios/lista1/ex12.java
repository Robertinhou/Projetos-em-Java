import java.util.Scanner;

public class ex12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i;
        double media;
        double [] notas = new double[3];
        media = 0;
        for(i = 0; i < 3; i++){
            System.out.print("Digite a "+ (i+1) +" ° nota: ");
            notas[i] = sc.nextDouble();
            media = media + notas[i]; 
        }

        media = (media / i);

        if (media < 7 ) {
            System.out.printf("A média é: %.0f e o aluno está reprovado", media);
        } else{
            System.out.printf("A média é: %.0f e o aluno está aprovado", media);
        }

    }
}
