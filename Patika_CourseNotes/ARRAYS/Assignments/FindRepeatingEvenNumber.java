
import java.util.Arrays;

class FindRepeatingEvenNumber {

    public static void main(String[] args) {

        int[] array = { 5, 2, 4, 7, 5, 9, 5, 9, 7, 2 , 4 };
        int[] duplicate = new int[array.length];
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j] && array[i] % 2 == 0) {
                    if (!isFind(duplicate, array[i]))
                        duplicate[startIndex++] = array[i];

                }

            }
        }
        System.out.println(Arrays.toString(duplicate));

    }

    public static boolean isFind(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }

        }
        return false;
    }

}