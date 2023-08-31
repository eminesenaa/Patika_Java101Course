import java.util.Scanner;

public class MinMaxSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scan.nextInt();
        
        int max = Integer.MIN_VALUE; // Başlangıçta en küçük değer olarak ayarlıyoruz
        int min = Integer.MAX_VALUE; // Başlangıçta en büyük değer olarak ayarlıyoruz
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int num = scan.nextInt();
            
            if (num > max) {
                max = num;
            }
            
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
        
        scan.close();
    }
}
