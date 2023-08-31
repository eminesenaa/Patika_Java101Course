package Assignments;


import java.util.Scanner;

public class PrimeRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scan.close();
    }

    static boolean isPrime(int number, int divisor) {
        if (divisor == 1)
            return true;

        else {
            if (number % divisor == 0)
                return false;

            return isPrime(number, divisor - 1);
        }
    }
}
