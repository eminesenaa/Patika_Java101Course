import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scan.nextInt();
        
        double harmonicSum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
        }
        
        System.out.println("Harmonik Seri Toplamı: " + harmonicSum);
        scan.close();
    }
}
