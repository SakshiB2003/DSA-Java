// Recursive Approach

import java.util.*;
public class Fibonacci {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
        
        System.out.println();
        sc.close();
        // System.out.println("The fibonacci series of " + n + " is: " + fib(n));
        
    }
}




