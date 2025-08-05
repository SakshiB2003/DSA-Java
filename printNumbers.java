import java.util.*;
public class printNumbers {
    static int f(int n){
        if(n==0){ 
            return n;
        }
        System.out.println("the Number : " + n);
        return f(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        System.out.println(f(n));
        sc.close();
    }
}
