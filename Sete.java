import java.util.Scanner;

public class Sete {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);

    double salario;

    double vendas;

    double comicao;

    System.out.println("Digite seu salario:");

    salario=scan.nextDouble();

    System.out.println("Digite o valor total de vendas:");

    vendas=scan.nextDouble();

    System.out.println("Digite o valor de comicao:");

    comicao=scan.nextDouble();

    double total = (comicao/100*vendas+salario);

    System.out.println("Total do salario é: R$"+ total);
    
    scan.close();
    
    }
}