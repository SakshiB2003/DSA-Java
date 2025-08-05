import java.util.*;
// Time complexity: O(n*n)

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element to be sorted: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sorted elements using Bubble Sort are: ");
        
         bubbleSort(arr);
         sc.close();
    }
}
