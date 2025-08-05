import  java.util.*;
public class InviteGuestsSingleOrPair {
    public static int callGuests(int n) {
        if(n <= 1) {
            return 1;
        }

        // single
        int ways1 = callGuests(n-1);
        // pair
        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Guests n :");
        int n = sc.nextInt();
        System.out.println("The number of ways in which " + n + " guests are invited single or pairs are: ");
        System.out.println(callGuests(n));
        sc.close();
    }
}
