import java.util.*;

public class StringOccurance {

    public static int first = -1;
    public static int last = -1;
    
    public static void findOccurance(String str, int idx, char element) {
        
        if(idx == str.length()){
            System.out.println("First occurence of " + element + " is at index " + first);
            System.out.println("Last occurence of " + element + " is at index " + last);
            return;
        }
        char currChar = str.charAt(idx);
        
        if(currChar == element) {
            if(first == -1) {
                first = idx;
            }
            else {
                last = idx;
            }
        }

        findOccurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        findOccurance(str, 0, 'b');
        sc.close();

    }
}
