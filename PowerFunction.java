import java.util.*;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the number n: ");
        int n = sc.nextInt();
        int result = 1;
        for(int i=0; i<n; i++){
            result = result * x;
        }
        System.out.println(result);
        sc.close();

    }
}
