package exceptionHandlingPackage;
//import exceptionHandlingPackage.Test;

class Test {
    int value = 10;
}

public class NestedTryBlock {

    public static void main(String[] args) {
        try {
            a3();
        }
        catch (ArithmeticException a) {
            System.out.println("Caught you here in the exception");
        }
        System.out.println("Hurra");
    }

    private static void a1() {
        Test test = null;
        test = new Test();
        try {
            System.out.println("Outer try begin");
            System.out.println(test.value);
            try {
                int i = 200, j = 0, result = i / j;
                System.out.println(result);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Arithmetic Problem");
            }
            System.out.println("Outer try end");
        }
        catch(NullPointerException e) {
            System.out.println("Test instaNCE not created");
        }
    }
    private static void a2() {
        Test test = null;
        test = new Test();
        try {
            System.out.println("Outer try begin");
            System.out.println(test.value);
            try {
                int i = 200, j = 0, result = i / j;
                System.out.println(result);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Arithmetic Problem");
            }
            System.out.println("Outer try end");
        }
        catch(NullPointerException e) {
            System.out.println("Test instaNCE not created");
        }
    }
    private static void a3() {
        Test test = null;
        test = new Test();
        try {
            System.out.println("Outer try begin");
            System.out.println(test.value);
            try {
                int i = 200, j = 0, result = i / j;
                System.out.println(result);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Arithmetic Problem");
            }
            System.out.println("Outer try end");
        }
        catch(NullPointerException e) {
            System.out.println("Test instaNCE not created");
        }
    }

}
