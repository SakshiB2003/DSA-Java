import java.util.*;


public class Strings {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.println("size of the array");
     int size = sc.nextInt();
     System.out.println("Enter Array elements");
     String array[] = new String[size];
     int totLength = 0;


     for(int i=0; i<size; i++) {
       array[i] = sc.next();
       totLength += array[i].length();
     }


     System.out.println(totLength);
     sc.close();

   }
}
