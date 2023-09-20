public class UsingForEach {
    public static void main(String[] args) {
        // in single dimension arrays
        System.out.println("1D Array" + "\n--------");
        String[] cars = { "BMW", "Mercedes", "Ford", "Ferrari" };
        for (String i : cars) {
            System.out.println(i);
        }

        System.out.println("\n3D Array" + "\n--------");

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        for (int[] u : matrix) {
            for (int elem : u) {
                System.out.println(elem);
            }
        }
    }

}
