import java.util.*;

public class UpdateBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operation: ");
        int opr = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        if(opr == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }

        sc.close();
       
    }
}
