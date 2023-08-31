package Assignments;


import java.util.Scanner;

public class ExponentialRecursive {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the power: ");
        int power = scan.nextInt();

        System.out.println(exponential(base, power));

        scan.close();

    }

    static int exponential(int base, int power) {
        if (power == 1)
            return base;
        else if (power == 0)
            return 1;

        else
            return base * exponential(base, power - 1);

    }
}
