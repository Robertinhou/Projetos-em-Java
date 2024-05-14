import java.util.Scanner;

public class ex02{
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
        System.out.println("A média é: "+ media / i );
    }
}
