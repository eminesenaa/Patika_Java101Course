import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Yarıçapı girin: ");
        double r = scan.nextDouble();

        System.out.print("Merkez açısının ölçüsünü girin: ");
        double alpha = scan.nextDouble();

        
        double pi = 3.14;

        
        double alan = (pi * r * r * alpha) / 360;

       
        System.out.println("Dairesel dilimin alanı: " + alan);

        scan.close();
    }
}
