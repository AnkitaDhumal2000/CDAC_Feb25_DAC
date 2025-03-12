// 5. Default Constructor parent child ,child parameterzed parent

class Parent {
    Parent() { // Default constructor in Parent
        System.out.println("Parent Default Constructor");
    }
}

class Child extends Parent {
    Child(String name) { // Parameterized constructor in Child
        super(name); // ERROR: Parent does not have a parameterized constructor
        System.out.println("Child Constructor::C1=" + name);
    }
}

public class OverridingHomeWork5 {
    public static void main(String args[]) {
        System.out.println("Creating Child Object:");
        Child c = new Child("Oops"); // Trying to call parameterized Child constructor
    }
}
