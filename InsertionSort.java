import java.util.*;
// Time complexity: O(n*n)

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements to be sorted");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }

        System.out.println("The sorted element using Insertion sort are:");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            sc.close();
        }
    }
}
