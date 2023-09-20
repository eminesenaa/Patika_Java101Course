
import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] array = { 5,2,4,7,5,9 };
        System.out.println("Max Closest Number: " + findMaxClosest(array, 5));
        System.out.println("Min Closest Number: " + findMinClosest(array, 5));

    }

    public static int findMaxClosest(int[] array, int input) {
        Arrays.sort(array);
        int result = Integer.MAX_VALUE;

        for (int i : array) {
            if (i > input) {
                result = i;
                break;
            }

        }

        return result;
    }

    public static int findMinClosest(int[] array, int input) {
        int result = Integer.MIN_VALUE;
        for (int i : array) {
            if (i < input)
                result = i;
        }

        return result;
    }
}
