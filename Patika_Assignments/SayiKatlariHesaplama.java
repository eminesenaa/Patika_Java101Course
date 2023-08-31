import java.util.Scanner;

public class SayiKatlariHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayi = scan.nextInt();

        int pow = 1;
        int lastPow = 1;

        System.out.println("2'nin Kuvvetleri");
        while (lastPow <= sayi) {
            System.out.println(lastPow);
            pow++;
            lastPow = (int) Math.pow(2, pow);
        }
        System.out.println("4'ün Kuvvetleri:");
        for (int i = 0; Math.pow(4, i) <= sayi; i++) {
            System.out.println((int) Math.pow(4, i));
        }

        System.out.println("5'in Kuvvetleri:");
        for (int i = 0; Math.pow(5, i) <= sayi; i++) {
            System.out.println((int) Math.pow(5, i));
        }
        scan.close();
    }
}
