import java.util.Scanner;

public class Seis {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");

    double num1 = scan.nextDouble();

    System.out.print("Digite o segundo número: ");

    double num2 = scan.nextDouble();

    double resultado = Math.log(num1) / Math.log(num2);

    System.out.printf("O logaritmo de %.2f\nna base %.2f\nResultado %.2f\n: ",num1,num2, resultado);

    scan.close();
    
  }
}