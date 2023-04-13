import java.util.Scanner;

public class Um {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);

    Double n1=0., n2=0., res =0.;

    System.out.println("Digite um número:");

    n1=scan.nextDouble();

    System.out.println("Digite outro número:");

    n2=scan.nextDouble();

    res=(n1+n2);
    
    System.out.println("O resultado é "+res/2);

    scan.close();

    }
}
