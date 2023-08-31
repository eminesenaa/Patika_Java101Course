import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = scanner.nextInt();
        
        int first = 0, second = 1;
        
        System.out.print(n + " Elemanlı Fibonacci Serisi: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            
            int next = first + second;
            first = second;
            second = next;
        }
        
        scanner.close();
    }
}
