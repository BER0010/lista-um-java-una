import java.util.Scanner;

public class Dez {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);

    double a,b,c;

    System.out.println("Digite o primeiro número:");

    a=scan.nextDouble();

    System.out.println("Digite o segundo número:");

    b=scan.nextDouble();

    System.out.println("Digite o terceiro número:");

    c=scan.nextDouble();

    double res1=(a+b+c)/3;

    double res2=3/((1/a)+(1/b)+(1/c));

    double res3=Math.cbrt(a*b*c);

    System.out.printf("Média aritmética %.2f\nMédia harmônica %.2f\nMédia geométrica %.2f\n ",res1,res2,res3);

    scan.close();
    
    }
}
