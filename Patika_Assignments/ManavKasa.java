import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = input.nextDouble();

        double toplamTutar = (armutFiyati * armutKilo) + (elmaFiyati * elmaKilo) + (domatesFiyati * domatesKilo)
                + (muzFiyati * muzKilo) + (patlicanFiyati * patlicanKilo);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");

        input.close();
    }
}
