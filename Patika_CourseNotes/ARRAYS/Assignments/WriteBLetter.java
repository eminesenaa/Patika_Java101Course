
public class WriteBLetter {
    public static void main(String[] args) {
        String[][] letter = new String[7][5];
        int width = letter[0].length;
        int height = letter.length;

        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || i == height / 2) {
                    System.out.print("*");
                } else if (j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      
    }
}
