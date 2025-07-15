package lab2;
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(msg(s));
    }
    public static String msg(String s) {
        return ("Hello " + s + ", Welcome to Java World!");
    }
}
