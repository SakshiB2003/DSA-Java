import java.util.*;

public class GreaterTwo {
    public static String voter(int n){
        if(n>=18){
            return "Eligible";
        }
        else{
            return "Not Eligible";

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to verify: ");
        int n = sc.nextInt();
        String no= voter(n);
        System.out.println(no);
        sc.close();
    }
}
