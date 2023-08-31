package Assignments;


import java.util.Scanner;

public class RecursivePattern {

    // Enter the number N : 16
    // Pattern: 16 11 6 1 -4 1 6 11 16

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number N : ");
        int n = scan.nextInt();
        System.out.print("Pattern: ");
        pattern(n);

        scan.close();
    }

    static void pattern(int a) {
        System.out.print(a + " ");
        if (a <= 0) {
            return;
        }
        pattern(a - 5);
        System.out.print(a + " ");
    }
}