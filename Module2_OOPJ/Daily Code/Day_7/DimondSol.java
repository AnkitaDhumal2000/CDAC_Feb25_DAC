interface A {
    void show();
}

interface B {
    void show();
}

// Class D implements both interfaces
class DimondSol implements A, B {
    // No ambiguity: Must provide its own implementation
    public void show() {
        System.out.println("Class D implementing show()");
    }

    public static void main(String[] args) {
        DimondSol obj = new DimondSol();
        obj.show(); // No ambiguity
    }
}
