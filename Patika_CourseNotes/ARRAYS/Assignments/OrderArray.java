
import java.util.Arrays;
import java.util.Scanner;

public class OrderArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter the element %d: ", i + 1);
            array[i] = scan.nextInt();
        }

        System.out.println("Sorted Array: " + Arrays.toString(sort(array)));

        scan.close();
    }

    public static int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
