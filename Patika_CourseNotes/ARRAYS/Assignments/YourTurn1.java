
import java.util.Arrays;
import java.util.Scanner;

public class YourTurn1 {
    // Creating an 2D array taking input from user.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[3][4];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr)); // this method prints the multidimen. arrays. toString doesnt work.

        scan.close();
    }
}
