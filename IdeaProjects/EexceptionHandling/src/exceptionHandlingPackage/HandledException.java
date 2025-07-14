package exceptionHandlingPackage;

public class HandledException {
    public static void main(String[] args) {
        int i = 100;
        int res;
        res = 0;
        System.out.println("Divide by Zero");
        try {
            res = i/0;
            System.out.println("Will this print?");
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Gracefully handled");
        }
        System.out.println(res);
    }
}
