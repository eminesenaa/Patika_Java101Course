import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Kenar: ");
        int k1 = scan.nextInt();

        System.out.print("2. Kenar: ");
        int k2 = scan.nextInt();

        double hipo = Math.sqrt(k1 * k1 + k2 * k2);
        System.out.println("Hipotenüs: " + hipo);
        
        double u = (k1 + k2 + hipo) / 2;
        double alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - hipo));

        System.out.printf("Alan:%.1f ", alan);

        scan.close();
    }
}
