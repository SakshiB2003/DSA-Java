import java.util.*;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("number of rows");
        int row = sc.nextInt();
        System.out.println("number of columns");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the x:");

        int x = sc.nextInt();

        System.out.println("element found at index: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == x){
                    System.out.print(i +", " + j);
                }
            }
            System.out.println();
        }
       sc.close();



    }
}
