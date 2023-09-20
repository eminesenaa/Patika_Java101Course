
import java.util.Scanner;

public class Game {
    static int move[];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        while (p-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            move = new int[n];
            int[] gameing = new int[n];
            for (int i = 0; i < n; i++) {
                gameing[i] = scan.nextInt();
            }

            System.out.println((canWin(gameing, leap, 0)) ? "YES" : "NO");
        }

        scan.close();
    }

    public static boolean canWin(int[] gameing, int leap, int i) {

        if (i >= gameing.length)
            return true;

        if (move[i] == 0) {
            move[i] = 1;
            if (gameing[i] == 0) {

                if (canWin(gameing, leap, i + leap))
                    return true;
                if (canWin(gameing, leap, i + 1)) {

                    return true;
                }
                if (i != 0)
                    if (canWin(gameing, leap, i - 1))
                        return true;
            }
        }
        return false;

    }

}
