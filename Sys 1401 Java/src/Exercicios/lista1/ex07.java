import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento da pessoa: ");
        int anoNascimento = sc.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        
        System.out.println("Essa pessoa tem "+ idade+" anos de idade e em 2050 terá "+ (2050 - anoNascimento));
    }
}
