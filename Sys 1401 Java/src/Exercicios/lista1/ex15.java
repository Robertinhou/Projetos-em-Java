import java.util.Scanner;

public class ex15 {
    public static double log(double base, double numero) {
        
        return Math.log(numero) / Math.log(base);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero");
        double numero = sc.nextInt();
        System.out.println("Informe a base");
        double base = sc.nextInt();

        System.out.println(log(base, numero));
    }

    

}
