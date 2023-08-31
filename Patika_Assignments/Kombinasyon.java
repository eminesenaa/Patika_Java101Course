import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scan.nextInt();

        System.out.print("r değerini girin: ");
        int r = scan.nextInt();

        long kombinasyon = combination(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);

        scan.close();
    }


    public static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
