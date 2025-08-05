// Time complexity = Worst case: O(n*n)
// Avaerage Case = O(nlogn)
import java.util.*;
public class QuickSort {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        // smaller elements ko place karne ke liye
        int i = low-1;
        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // pivot swap
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;

    }

    public static void sort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int arr[] =  new int[n];

        System.out.println("Enter the elements to be sorted: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, arr.length-1);
        System.out.println("Array After Quick Sort: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        sc.close();
    }
}
