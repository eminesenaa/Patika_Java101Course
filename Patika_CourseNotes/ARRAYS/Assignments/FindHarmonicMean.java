
public class FindHarmonicMean {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Average: " + average(numbers));
        System.out.println("Harmonic Series: " + harmonic(numbers));
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public static double harmonic(int[] array) {
        double result = 0;

        for (int i : array) {
            result += 1.0 / i;}
        return result;
    }
}
