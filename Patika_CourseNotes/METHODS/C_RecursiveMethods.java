public class C_RecursiveMethods {
    // In Java, the operation in which a method calls itself is called a
    // **recursive** operation.
    // This process allows a problem to be broken down into smaller parts and made
    // more easily solvable.
    // For example, a method named `factorial` is defined in the following code:
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n ){

        if (n == 0) 
            return 1;    
        else
            return n * factorial(n - 1);}
}
