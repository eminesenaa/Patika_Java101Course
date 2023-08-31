package Assignments;


public class Fibonacci {

    // Fibonacci Series:
    // 0 1 1 2 3 5 8 13 21 34

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    // The fibonacci method takes an integer n as input and returns the nth term of
    // the Fibonacci sequence.
    
    static int fibonacci(int number) {
        if (number <= 1 )
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}