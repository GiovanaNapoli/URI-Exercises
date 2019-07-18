import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio, area, n;
        n = 3.14159;
        
        raio = ler.nextDouble();
        area = (raio * raio) * n;
        
        System.out.printf("A%.4f\n = "+area);
        
    }

}