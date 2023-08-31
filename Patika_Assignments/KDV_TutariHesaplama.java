import java.util.Scanner;

public class KDV_TutariHesaplamaa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("KDV'siz Fiyat: ");
        double kdvsiz = scan.nextDouble();

        boolean kosul = kdvsiz > 1000;
        double kdvOrani = kosul ? 0.08 : 0.18;

        double kdvli = kdvsiz + kdvsiz * kdvOrani;
        System.out.println("KDV'li Fiyat: " + kdvli);
        double kdvTutari = kdvli - kdvsiz;

        System.out.printf("KDV Tutarı:%.2f  ", kdvTutari);

        scan.close();
    }
}
