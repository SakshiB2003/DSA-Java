import java.util.*;
// Time complexity: O(n*n)

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements to be sorted");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

       for(int i=0; i<arr.length-1; i++){
        int smallest = i;
        for(int j =i+1; j<arr.length; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
       }

        System.out.println("The sorted elements using Insertion sort are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
