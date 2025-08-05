import java.util.*;

public class ReverseString {
    public static void reverse(String str, int idx){

        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        reverse(str, idx-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The reverse of " + str + " is: ");
        reverse(str, str.length()-1);
        sc.close();
    }
}
