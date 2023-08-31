import java.util.Scanner;

public class EtkinlikOnerici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık kaç derece? : ");
        int sicaklik = input.nextInt();

        switch (sicaklik) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Kayak yapabilirsin.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Sinemaya gidebilirsin.");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                System.out.println("Piknik gidebilirsin.");
                break;
            default:
                System.out.println("Yüzmeye gidebilirsin.");
                break;
        }

        input.close();
    }
}
