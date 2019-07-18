import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double media, a, b;
        
        a = ler.nextDouble();
        b = ler.nextDouble();
        
        media = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5);
        
        System.out.printf("MEDIA = %.5f\n",media);
        ler.close();
    }

}