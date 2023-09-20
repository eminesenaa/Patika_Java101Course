
public class Frequency {
    public static void main(String[] args) {
        int[] array = { 10, 20, 20, 10, 10, 20, 5, 20 };

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            boolean isCount = true;
            for (int k = i - 1; k >= 0; k--) {
                if (array[i] == array[k]) {
                    isCount = false;
                    break;
                }
            }

            if (isCount) {
                System.out.printf("Element %d is repeated for %d times\n", array[i], count);
            }
        }
    }
}
