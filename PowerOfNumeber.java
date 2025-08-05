import java.util.*;

public class PowerOfNumeber {
    public static int power(int base, int n) {
        if(n == 0) {
            return 1;
        }
        return base * power(base, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // enter the number
        System.out.println("Enter the base: ");
        int base = sc.nextInt();

        // enter the power
        System.out.println("Enter the power: ");
        int x = sc.nextInt();

        System.out.println("The power of " + base + " to the " + x + " is:");

        System.out.println(power(base, x));
        sc.close();
    }
}    

