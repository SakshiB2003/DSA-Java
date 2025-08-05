import java.util.*;

public class MergeTwoArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array 1: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the elemnts of 1st Array : ");
        
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array 2: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the element of 2nd Array: ");

        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        int merge[] = new int[arr1.length + arr2.length];

        for(int i=0; i<arr1.length; i++){
            merge[i] = arr1[i];
        }

        for(int i = 0; i<arr2.length; i++){
            merge[arr1.length+i] = arr2[i];
        }
        Arrays.sort(merge);

         System.out.print("Merged Array: " + Arrays.toString(merge));
         sc.close();

    }
}
