package lab2;
import java.util.Scanner;
public class program3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = (a >= b && a >= c)? a : ((b >= a && b >= c) ? b : c);
            System.out.println("Largest number is: " + x);
        }
}
