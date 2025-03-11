class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    // Error: Cannot overload method with same signature but different return type
    static double add(int a, int b) {
        return a + b;
    }
}

public class MethodOverloading3 {
    public static void main(String[] args) {
       System.out.println(Adder.add(10, 20));  // Compilation Error
    }
}

/* Output :
MethodOverloading3.java:7: error: method add(int,int) is already defined in class Adder
    static double add(int a, int b) {
                  ^
1 error

*/