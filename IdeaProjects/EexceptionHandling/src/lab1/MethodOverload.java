package lab1;

public class MethodOverload {

    public void add(int a, int b) {
        System.out.println("Sum (int, int): " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum (int, int, int): " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Sum (double, double): " + (a + b));
    }

    public void add(String a, int b) {
        System.out.println("Concat (String, int): " + a + " " + b);
    }

    public void add(short a, short b) {
        System.out.println("Sum (short, short): " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.1);
        obj.add("Hello", 20);
        obj.add((short)5, (short)6);
    }
}
