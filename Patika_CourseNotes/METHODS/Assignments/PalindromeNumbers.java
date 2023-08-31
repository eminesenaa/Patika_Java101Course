package Assignments;


public class PalindromeNumbers {

    // A palindrome is a number that reads the same forwards and backwards.
    public static void main(String[] args) {
        System.out.println(isPalindrome(4)); // true
        System.out.println(isPalindrome(99)); // true
        System.out.println(isPalindrome(4004)); // true
        System.out.println(isPalindrome(48504)); // false

    }

    static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

}
