import java.util.Scanner;

public class Tres {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);

    int t1=0;

    System.out.println("Informe a temperatura em Fahrenheit:");

    t1=scan.nextInt();

    double cal = ((t1-32)/1.8);

    System.out.println("A temperatura em grau centígrados é " + Math.floor(cal)+"°C");

    scan.close();

    }
}