
public class Subarray {
    public static void main(String[] args) {
        int[] array = { 1 , -2, 4, -5,1};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int[] heap = new int[array.length];
            int startIndex = 0;

            for (int j = 0; j < i; j++) {
                heap[startIndex++] = array[j];
            }
            if (findSum(heap) < 0)
                count++;

        }
        System.out.println(count);

    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
