import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);

    System.out.println("Digite o número de horas trabalhadas:");

    double horas = scan.nextDouble();

    System.out.println("Digite o valor recebido por hora:");

    double valor = scan.nextDouble();

    double cal = (valor*horas);

    double salario = 59.82;

    System.out.println("Digite quantos filhos menores de 14 anos você tem:");

    double filhos = scan.nextDouble();

    double res = (salario*filhos);

    System.out.println("o sálario bruto é:  "+(res+cal));

    scan.close();


    
    }
}