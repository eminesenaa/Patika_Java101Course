import java.util.Arrays;

public class ArraysClassAndMethods {

    public static void main(String[] args) {
        // Example 1: toString() method
        int[] intArray = { 5, 2, 9, 1, 5 };
        String arrayStr = Arrays.toString(intArray);
        System.out.println("Array as String: " + arrayStr);
        System.out.println("----------------------------------------------");

        // Example 2: sort() method
        int[] sortedArray = Arrays.copyOf(intArray, intArray.length); // Create a copy
        Arrays.sort(sortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println("----------------------------------------------");

        // Example 3: binarySearch() method
        int key = 9;
        int index = Arrays.binarySearch(sortedArray, key);
        System.out.println("Index of " + key + " in sorted array: " + index);
        System.out.println("----------------------------------------------");

        // Example 4: equals() method
        int[] anotherArray = { 5, 2, 9, 1, 5 };
        boolean areEqual = Arrays.equals(intArray, anotherArray);
        System.out.println("Arrays are equal: " + areEqual);
        System.out.println("----------------------------------------------");

        // Example 5: fill() method
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled Array: " + Arrays.toString(filledArray)); // output [7, 7, 7, 7, 7]
        System.out.println("----------------------------------------------");

        // Example 6: copyOf() method
        int[] sourceArray = { 0 , 1, 2, 3, 4 };
        int[] copiedArray = Arrays.copyOf(sourceArray, 3); // Copy the first 3 elements
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
        System.out.println("----------------------------------------------");

        // Example 7: copyOfRange() method
        int[] copyOfRangeArray = Arrays.copyOfRange(sourceArray, 2,4);
        System.out.println("Copied Array (from 2nd to 4th index / 4 not included): "+  Arrays.toString(copyOfRangeArray));
    }

}
