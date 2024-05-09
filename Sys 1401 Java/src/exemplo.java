public class exemplo {
    public static void main(String[] args) {
        int y = 30;
        int idade = 31;
        String nome = "Maria de Jesus";
        Double renda = 4000.0;
        Double x = 100.345;
        System.out.println("Ola Mundo!");
        System.out.printf("%.2f%n",x);
        System.out.println("Resultado = "+ y + " metros");
        System.out.printf("Resultado = %.2f Metros%n", x);
        System.out.printf("%s tem %d anos de idade e ganha R$%.2f reais%n",nome,idade,renda);
        // %f = ponto flutuante
        // %d = inteiro
        // %s = texto
        // %n = parar de executar a linha
        //printf = escrever manipulando strings
    }
}
