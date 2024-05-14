import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome do funcionário: ");
        String nome = sc.next();

        System.out.println("Informe o salário do funcionário: ");
        double salario = sc.nextDouble();

        double aumento = salario * 0.15;
        double salarioFinal = salario + aumento;

        System.out.println("O funcionário " + nome + " teve um aumento de 15% e seu salário final é: "+salarioFinal); 
    }
}
