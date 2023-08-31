import java.util.Scanner;

public class UcakBiletiHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            double birimFiyat = 0.10;
            double normalTutar = mesafe * birimFiyat;
            double indirimliTutar = normalTutar;

            if (yas < 12) {
                indirimliTutar -= normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                indirimliTutar -= normalTutar * 0.10;
            } else if (yas >= 65) {
                indirimliTutar -= normalTutar * 0.30;
            }

            if (yolculukTipi == 2) {
                indirimliTutar *= 0.80;
            }

            double toplamTutar = yolculukTipi == 2 ? indirimliTutar * 2 : indirimliTutar;

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }

        input.close();
    }
}
