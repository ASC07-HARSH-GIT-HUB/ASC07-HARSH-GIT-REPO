package lab2;
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Ex: 951
        int x = n%10; // 1
        int m = n/10; // 95
        int y = m%10; // 5
        int o = m/10; // 9
        toStr(o);
        toStr(y);
        toStr(x);
    }
    public static void toStr(int n) {
        switch(n) {
            case 0: System.out.print("Zero ");
                    break;
            case 1: System.out.print("One ");
                break;
            case 2: System.out.print("Two ");
                break;
            case 3: System.out.print("Three ");
                break;
            case 4: System.out.print("Four ");
                break;
            case 5: System.out.print("Five ");
                break;
            case 6: System.out.print("Six ");
                break;
            case 7: System.out.print("Seven ");
                break;
            case 8: System.out.print("Eight ");
                break;
            case 9: System.out.print("Nine ");
                break;
        }
    }
}
