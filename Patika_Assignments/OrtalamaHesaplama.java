import java.util.Scanner;

public class OrtalamaHesaplama{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Ders Notu:");
        int mat = scan.nextInt();

        System.out.println("Fizik Ders Notu:");
        int fizik = scan.nextInt();

        System.out.println("Kimya Ders Notu:");
        int kimya = scan.nextInt();

        System.out.println("Türkçe Ders Notu:");
        int turkce = scan.nextInt();

        System.out.println("Tarih Ders Notu:");
        int tarih = scan.nextInt();

        System.out.println("Müzik Ders Notu:");
        int muzik = scan.nextInt();

        int ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        boolean baraj = ort > 60;

        String sonuc = baraj ? "Sınıfı Geçti." : "Sınıfta Kaldı.";
        System.out.println(sonuc);
        scan.close();
    }
}
