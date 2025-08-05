// Time Complexity = O(n!)
import java.util.*;

public class StringPermutation {
    public static void printPermutation(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPermutation(newString, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("The permutation of the String: ");
        printPermutation(str, "");
        sc.close();
    }
}
