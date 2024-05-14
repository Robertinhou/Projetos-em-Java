import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a distância percorrida: ");
        double distancia = sc.nextDouble();
        System.out.println();
        System.out.println("Informe o consumo de combustível: ");
        double consumo = sc.nextDouble();

        System.out.println("O consumo por km foi de: "+ (distancia/consumo));
    }
}
