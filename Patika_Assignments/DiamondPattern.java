import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the diamond: ");
        int size = scan.nextInt(); /* 7 */

        if (size % 2 == 0) {
            System.out.println("Please enter an odd number for a better diamond pattern.");

        }

        int space = size / 2; /* 3 */
        int star = 1;

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < (size + 1) / 2) {
                space--;
                star += 2;
            }

            else {
                space++;
                star -= 2;
            }

        }

        scan.close();
    }
}
