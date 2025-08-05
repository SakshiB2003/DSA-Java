import java.util.*;
public class LinearSearch {
    public static int linearSearch(int[] arr, int k){
        for(int i=0; i<arr.length;i++){
            if(arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the key for search: ");
        int k = sc.nextInt();
        int result = linearSearch(arr, k);
        if(result == -1){
            System.out.println("Key not Found");
        }
        else{
            System.out.println("Key " + k + " found at index " + result);
        }
        
        sc.close();

    }
}