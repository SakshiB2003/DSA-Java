import java.util.*;
public class StringReverse{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    System.out.println("Enter the String: ");
    String in = sc.nextLine();
    sb.append(in);
    for(int i=0; i<sb.length()/2; i++){
      int front = i;
      int back = sb.length()-1-i;

      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);
       
      sb.setCharAt(front, backChar);
      sb.setCharAt(back, frontChar);
    }

    System.out.println("The reverse String is: ");
    System.out.println(sb);
    sc.close();

  }
}