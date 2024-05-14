import java.util.Scanner;

public class ex13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int i;
        double media;
        double [] notas = new double[3];
        media = 0;
        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();
        for(i = 0; i < 3; i++){
            System.out.print("Digite a "+ (i+1) +" ° nota: ");
            notas[i] = sc.nextDouble();
            media = media + notas[i]; 
        }

        media = (media / i);

        if (media < 5 ) {
            System.out.printf("A média é: %.2f e o aluno está reprovado", media);
        }else if (media > 5  & media < 7  ) {
            System.out.printf("A média é: %.2f e o aluno está de recuperação", media);
        } 
        else{
            System.out.printf("A média é: %.2f e o aluno está aprovado", media);
        }

    }
}
