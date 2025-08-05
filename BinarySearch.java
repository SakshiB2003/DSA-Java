import java.util.*;
public class BinarySearch {
    public static int binarySearch(int[] arr, int k){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] < k){
                start = mid+1;
            }
            else if(arr[mid] > k){
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
       
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);
        
        if(result == -1){
            System.out.println("Key not Found");
        }
        else {
            System.out.println("Key " + key + " found at: "+ result);
        }
        sc.close();

    }
}
