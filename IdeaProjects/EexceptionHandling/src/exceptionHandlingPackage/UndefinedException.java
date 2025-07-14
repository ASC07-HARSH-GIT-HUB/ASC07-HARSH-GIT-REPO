package exceptionHandlingPackage;

public class UndefinedException {
    public static void main(String[] args) {
        int i = 100;
        System.out.println("Divide by zero");
        int result = 1%0;
        System.out.println(result);
    }
}
