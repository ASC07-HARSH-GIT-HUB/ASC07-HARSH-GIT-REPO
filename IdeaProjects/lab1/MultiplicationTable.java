package lab1;

public class MultiplicationTable {

    public static void tableUsingFor(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void tableUsingWhile(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }

    public static void tableUsingDoWhile(int n) {
        int i = 1;
        do {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        tableUsingFor(2);
        tableUsingWhile(3);
        tableUsingDoWhile(4);
    }
}
