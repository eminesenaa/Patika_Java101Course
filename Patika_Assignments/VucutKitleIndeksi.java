import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) girin: ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu (kg cinsinden) girin: ");
        double kilo = input.nextDouble();

        double vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);

        input.close();
    }
}
