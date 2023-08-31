import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("s değerini girin: ");
        int s = scan.nextInt();

        System.out.print("k değerini girin: ");
        int k = scan.nextInt();

        int sonuc = 1;
        for (int i = 0; i < k; i++) {
            sonuc *= s;
        }
        System.out.println(sonuc);
        scan.close();

    }
}
