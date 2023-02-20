
import java.util.Scanner;

public class Tekrar1 {
    
    public static void main(String[] args) {
        System.out.println("Toplama işlemi için tam sayıları giriniz: ");
        System.out.println("Birinci sayı: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("İkinci sayı: ");
        int b = scanner.nextInt();
        
        int sonuc = a + b;
        System.out.println("Toplama işlemi sonucu: " +sonuc);
        
    }
    
}
