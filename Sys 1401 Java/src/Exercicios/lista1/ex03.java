import java.util.Scanner;

public class ex03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        double salario;
        
       
            System.out.print("Informe o sálario do funcionário: ");
            salario = sc.nextDouble();
            salario = (salario + (salario *25/100));
            System.out.println("O salário é: "+ salario );
    }
}

