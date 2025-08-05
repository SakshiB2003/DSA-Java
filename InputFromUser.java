import java.util.*;

public class InputFromUser {
    public static void main(String[] args) {
        
        int[] arr = new int[100];
        int count_p = 0; 
        int count_n = 0;
        int count_z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 0;i<n; i++) {
             arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                count_p++;
            }
            else if(arr[i]==0){
                count_z++;
            }
            else if(arr[i]<0){
                count_n++;
            }
            else{
                System.out.println("Wrong entry");
            }
        }
        System.out.println("Count of Positive Number: " + count_p);
        System.out.println("Count of Negative Number: " + count_n);
        System.out.println("Count of Zeros Number: " + count_z);
        sc.close();

   }
}
