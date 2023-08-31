public class B_MethodOverloading {
    
    // Method overloading is the process of defining multiple methods with the same name in Java. 
    // This operation allows methods to be called with different parameters. 
    // For example, two different methods named `display` are defined in the following code:
    
    public static void main(String[] args) {
        display(1);
        display(1, 4);
    }
    
    private static void display(int a) {
        System.out.println("Arguments: " + a);
    }

    private static void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    // If the first display method is used by changing it to int type, a compilation error will occur, overloading does not work.

}
