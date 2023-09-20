
import java.util.Arrays;

public class YourTurn2 {
    // create an array with random numbers btw 0-99.
    

    public static void main(String[] args) {
        
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

         System.out.println(Arrays.deepToString(array)); 
    }
}
