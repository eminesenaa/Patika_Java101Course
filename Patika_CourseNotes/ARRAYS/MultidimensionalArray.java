public class MultidimensionalArray {

    public static void main(String[] args) {
        // Create a 2D array (matrix) of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print elements of the 2D array
        System.out.println("Matrix Elements:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        // Create a 3D array of strings
        String[][][] threeDArray = {
            {
                {"A1", "A2", "A3"},
                {"A4", "A5", "A6"}
            },
            {
                {"B1", "B2"},
                {"B3", "B4", "B5"}
            }
        };

        // Access and print elements of the 3D array
        System.out.println("\n3D Array Elements:");

        for (int i = 0; i < threeDArray.length; i++) {
            for (int j = 0; j < threeDArray[i].length; j++) {
                for (int k = 0; k < threeDArray[i][j].length; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println(); // Move to the next row
            }
            System.out.println(); // Separate 3D "slices" with an empty line
        }
    }
}
