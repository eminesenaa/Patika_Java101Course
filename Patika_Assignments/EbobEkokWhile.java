import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı giriniz: ");
        int num1 = scanner.nextInt();
        
        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = scanner.nextInt();
        
        int ebob = 1;
        int ekok = (num1 * num2) / ebob; // İlk olarak EKOK'u bu şekilde hesaplayabiliriz
        
        int smaller = Math.min(num1, num2);
        int i = 1;
        
        while (i <= smaller) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i; 
            }
            
            i++;
        }
        
        ekok = (num1 * num2) / ebob; // EKOK'u güncelliyoruz
        
        System.out.println(num1 + " ve " + num2 + " sayılarının EBOB'u: " + ebob);
        System.out.println(num1 + " ve " + num2 + " sayılarının EKOK'u: " + ekok);
        
        scanner.close();
    }
}
