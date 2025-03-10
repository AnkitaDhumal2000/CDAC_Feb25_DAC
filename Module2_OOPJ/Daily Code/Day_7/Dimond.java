class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C");
    }
}

// ERROR: Java does not allow multiple inheritance of classes
class Dimond extends B, C { 
    public static void main(String[] args) {
        Dimond obj = new D();
        obj.show(); // Compiler error: Which show() method should be called?
    }
}
