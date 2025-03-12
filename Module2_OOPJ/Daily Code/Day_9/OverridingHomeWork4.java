// 4 default constructor parent,child : child parameterized.

class Parent {
    Parent() { // Default constructor in Parent
        System.out.println("Parent Default Constructor");
    }
}

class Child extends Parent {
    Child() { // Default constructor in Child
        super(); // Calls Parent's default constructor (implicitly done even if omitted)
        System.out.println("Child Default Constructor");
    }

    Child(String name) { // Parameterized constructor in Child
        super(); // Calls Parent's default constructor
        System.out.println("Child Constructor::C1=" + name);
    }
}

public class OverridingHomeWork4 {
    public static void main(String args[]) {
        System.out.println("Creating Child with Default Constructor:");
        Child c1 = new Child(); // Calls default constructors

        System.out.println("\nCreating Child with Parameterized Constructor:");
        Child c2 = new Child("Oops"); // Calls Parent's default constructor, then Child's parameterized constructor
    }
}
