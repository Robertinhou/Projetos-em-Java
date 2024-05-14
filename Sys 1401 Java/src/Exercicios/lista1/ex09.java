import java.util.Scanner;
public class ex09 {
    
    static void parOuImpar(double numero){
        if (numero % 2 == 0){
            System.out.println("O número é par");
        }
        else if(numero % 2 != 0 ){
            System.out.println("O número é par");
        }

    } 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.println("Digite um número: ");
        numero = sc.nextDouble();

        parOuImpar(numero);


    }
    
    
}
