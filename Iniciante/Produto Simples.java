import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int prod, a, b;
        
        a = ler.nextInt();
        b = ler.nextInt();
        
        prod = a * b;
        
        System.out.println("PROD = "+prod);
        ler.close();
 
    }
 
}