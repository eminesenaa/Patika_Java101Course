import java.util.Scanner;

public class BurcBelirleyici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum gününüzün gününü girin: ");
        int gun = input.nextInt();

        System.out.print("Doğum gününüzün ayını girin: ");
        int ay = input.nextInt();

        String burc = "";

        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            burc = "Koç Burcu";
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            burc = "Boğa Burcu";
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            burc = "İkizler Burcu";
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            burc = "Yengeç Burcu";
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            burc = "Aslan Burcu";
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            burc = "Başak Burcu";
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            burc = "Terazi Burcu";
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            burc = "Akrep Burcu";
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            burc = "Yay Burcu";
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            burc = "Oğlak Burcu";
        } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            burc = "Kova Burcu";
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            burc = "Balık Burcu";
        } else {
            burc = "Geçersiz tarih";
        }

        System.out.println("Burcunuz: " + burc);

        input.close();
    }
}
