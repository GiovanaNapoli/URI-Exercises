import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner ler = new Scanner(System.in);
        int soma, a, b;
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        soma = a + b;
        
        System.out.println("SOMA = "+soma);
        ler.close();
    }
 
}