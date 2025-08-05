import java.util.*;

public class Circumference {
    public static double circle(double r){
        final double pi = 3.14;
        return 2*pi*r;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println(circle(r));
        sc.close();
    }
}
