//6 Default construcyor parent and child : child parameterized child and parent.

class Parent {
    Parent() { // Default constructor in Parent
        System.out.println("Parent Default Constructor");
    }

    Parent(String name) { // Parameterized constructor in Parent
        System.out.println("Parent Constructor::P1=" + name);
    }
}

class Child extends Parent {
    Child() { // Default constructor in Child
        super(); // Calls Parent's default constructor (even if omitted, Java inserts it)
        System.out.println("Child Default Constructor");
    }

    Child(String name) { // Parameterized constructor in Child
        super(name); // Calls Parent's parameterized constructor
        System.out.println("Child Constructor::C1=" + name);
    }
}

public class OverridingHomeWork6{
    public static void main(String args[]) {
        System.out.println("Creating Child with Default Constructor:");
        Child c1 = new Child(); // Calls default constructors

        System.out.println("\nCreating Child with Parameterized Constructor:");
        Child c2 = new Child("Oops"); // Calls parameterized constructors
    }
}
