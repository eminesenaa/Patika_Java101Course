import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayısı girin:");
        int n = scan.nextInt();

        int space = 0;
        int star = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
            space++;
            star -= 2;

        }
        scan.close();
    }
}
