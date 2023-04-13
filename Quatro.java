import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);

    System.out.println("Qual o valor da aplicação:");

    double valor=scan.nextDouble();

    System.out.println("Informe o prazo:");

    double prazo=scan.nextDouble();

    System.out.println("Informe a taxa de juros: (em %)");

    double taxa=scan.nextDouble();

    double montante=valor* Math.pow(1+taxa/100,prazo);

    System.out.printf("o montante é: %.2f.%n",montante);
     
    scan.close();

    }
}