import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double numero,numero2;

            System.out.print("Digite um número: ");
            numero = sc.nextDouble();
            while(numero < 1){
                System.out.println("Digite um número maior que 0: ");
                numero = sc.nextDouble();
            }
            System.out.println("");
            System.out.print("Digite outro número: ");
            numero2 = sc.nextDouble();
            while(numero2 < 1){
                System.out.println("Digite um número maior que 0: ");
                numero2 = sc.nextDouble();
            }
            System.out.println();


            System.out.println("A potência é: "+ Math.pow(numero, numero2));

        }
}
