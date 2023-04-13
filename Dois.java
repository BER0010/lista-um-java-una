import java.util.Scanner;

public class Dois {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Digite um número:");

    double n1=scan.nextDouble();

    System.out.println("O novo valor é "+(n1*0.1+n1));
    
    scan.close();
    }
}