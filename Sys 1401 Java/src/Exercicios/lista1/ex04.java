import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura,area;

        System.out.print("Digite a base do triângulo: ");
        base = sc.nextDouble();
        System.err.println("");
        System.out.print("Digite a altura do triângulo: ");
        altura = sc.nextDouble();
        System.out.println();
        area = (base * altura) / 2;

        System.out.println("A área é: "+ area);

    }
}
