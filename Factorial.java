import java.util.*;
public class Factorial {
    static int fac(int n) {
        if(n<=1) {
            return n;
        }
        return n * fac(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The factorial of " + n + " is: " + fac(n));
        sc.close();
    }
}
