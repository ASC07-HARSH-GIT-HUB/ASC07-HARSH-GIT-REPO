package lab1;

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Showing from A");
    }

    public void display() {
        System.out.println("Displaying from B");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();      // Output: Showing from A
        obj.display();   // Output: Displaying from B
    }
}

