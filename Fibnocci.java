import java.util.*;

public class Fibnocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Fibnocci series: ");
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               int temp = b;
               b = a + b;
               a = temp;
           }


           System.out.println();
       }
       sc.close();

    }
}
