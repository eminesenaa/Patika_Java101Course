import java.util.Scanner;

public class SayiBasamakToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scan.nextInt();

        int sum = 0;
        int newValue = number;
        int digitCount = 0;


        while (newValue > 0) {
            sum += newValue % 10;
            newValue /= 10;
              digitCount++;
        }
        System.out.println(number + " sayısının basamakları toplamı: " + sum);
        System.out.println("Girilen sayının basamak sayısı: " + digitCount);
                   
        newValue = number;
        int arms = 0;
        while (newValue > 0) {
            arms += Math.pow(newValue % 10, digitCount);
            newValue /= 10;
        }
        
        if(arms == number)
            System.out.println(true);
        else
            System.out.println(false);


        scan.close();
    }
}
