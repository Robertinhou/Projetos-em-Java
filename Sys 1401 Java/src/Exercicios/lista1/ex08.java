import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa: ");
        double peso = sc.nextDouble();
        double highPeso = (peso + peso * 15/100); 
        double lowPeso = (peso - peso*20/100);
        System.out.println("Se a pessoa emagrecer 15% de seu peso ficará com "+ lowPeso+ " e se engordar 20% ficará com "+highPeso);





    }
}
