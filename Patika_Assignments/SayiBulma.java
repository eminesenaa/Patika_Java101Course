import java.util.Scanner;

class SayiBulma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayi = scan.nextInt();
        int total = 0;
        while (sayi >= 0) {
            if (sayi % 4 == 0)
                total += sayi;

            sayi = scan.nextInt();
        }

        System.out.println(total);
scan.close();
    }
}