
import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("enter the operation you want to perform and press x for exist");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("enter the numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }
                System.out.println(ans);
            } 
        else if (op == 'x' || op == 'X') {
                break;
            } 
        else {
                System.out.println("enter valid operator");
            }
        }
        sc.close();

    }
}
