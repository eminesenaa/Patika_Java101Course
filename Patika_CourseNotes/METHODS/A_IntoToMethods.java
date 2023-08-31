public class A_IntoToMethods {
    
    // ! method definition
    
    /*  dataType methodName(parameter1, parameter2, ....) {
          code block }    */
    
    public static void main(String[] args) {
        
        int result = addition(2,9);
        System.out.println(result);
        add(2,9);
    }

    // return method
    static int addition(int a, int b){
        return a + b;
    }

    // void method
    static void add(int a, int b ){
        System.out.println(a + b);
    }
}
