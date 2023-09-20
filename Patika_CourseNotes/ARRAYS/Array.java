import java.util.Arrays;

// Arrays in Java are used to store multiple values ​​in a single variable 
// instead of creating separate variables for each value.

public class Array {
    public static void main(String[] args) {
        // Declare and initialize an integer array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Access and print elements of the array
        System.out.println("First element: " + numbers[0]); // Prints 1
        System.out.println("Second element: " + numbers[1]); // Prints 2
        System.out.println("Array length: " + numbers.length); // Prints 5

        printArray(numbers);

        System.out.println(Arrays.toString(reverse(numbers)));
    }

    public static void printArray(int[] array) {

        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = array.length - 1; j >= 0; i++, j--) {
            result[j] = array[i];
        }
        return result;
    }
}
