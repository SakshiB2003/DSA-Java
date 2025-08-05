import java.util.*;

public class SumOfOddNumber {
      public static void sumOfOdd(int n){
        if(n%2==0){
            System.out.println("Number is even");
        }
        else{
            int sum = 0;
            for(int i=0; i<=n; i++){
                if(i%2==0){
                    continue;
                }
                else{
                    sum += i;
                }
            }
            System.out.println(sum);
        }
      }

      public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = obj.nextInt();
        sumOfOdd(n);
        obj.close();
      }
}

