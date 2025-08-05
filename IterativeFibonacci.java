import java.util.Scanner;

public class IterativeFibonacci {
    static void fib(int n) {
        int a = 0, b = 1, next;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        fib(n);
        System.out.println();
        sc.close();
    }
}