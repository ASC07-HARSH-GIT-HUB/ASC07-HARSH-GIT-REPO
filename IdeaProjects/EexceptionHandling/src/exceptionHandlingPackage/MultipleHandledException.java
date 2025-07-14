package exceptionHandlingPackage;

public class MultipleHandledException {
    public static void main(String[] args) {
        String colors[] = {};
        Calculator calci = null;
        System.out.println("Normal Calculator");
        try {
            for (int i = 0; i <= 2; i++) {
                System.out.println(colors[i]);
            }
            calci.add(50,50);
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Check index....");
        }
        catch (NullPointerException npe) {
            System.out.println("Instantiate the calculator....");
        }
        System.out.println("Thank You");
    }
}