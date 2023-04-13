import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int carros, motos, veiculos, rodas;
                      
        System.out.println("Informe o número de veículos no estacionamento:");

        veiculos = scan.nextInt();
        
        System.out.println("Informe a quantidade de rodas:");

        rodas = scan.nextInt();
        
        motos = ((4 * veiculos) - rodas) / 2;
        
        carros = (veiculos - motos);
        
        System.out.println("A quantidade de carros é:" + carros);
        System.out.println("A quantidade de motos é:" + motos); 

        scan.close();     
    }    
}
