import java.util.*;
public class ZerosAtLast {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter: ");
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }

        System.out.println("After sorting the Zero at last: ");
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
    
}
