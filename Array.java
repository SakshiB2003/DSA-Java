import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int [] number = new int[size];
        System.out.println("Enter elements of Array");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
       System.out.println("Enter number you want to search");
        int x = sc.nextInt();

        System.out.println("Finding x: ");
        for(int i =0; i<number.length; i++){
            if(number[i] == x){
                System.out.println("x found at index " + i);
            }
           
        }
        sc.close();

    }
    
}
