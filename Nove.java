import java.util.Scanner;

public class Nove {
    public static void main(String[] args) throws Exception {
        
    Scanner scan = new Scanner (System.in);

    System.out.println("Digite a quantidade de segundos:");

    double seg=scan.nextDouble();

    double h = (seg/60/60);

    double m = (seg/60);
    
    double s = (seg);

    System.out.printf("Horas %.2f\nMinutos %.2f\nSegundos %.2f\n",h,m,s);

    scan.close();

    }
}