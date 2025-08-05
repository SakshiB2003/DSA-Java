import java.util.*;
public class StringReplace{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string");
       String st = sc.next();
       String result = "";
       for(int i=0; i<st.length(); i++){
        if(st.charAt(i) == 'e'){
            result += 'i';
        }
        else{
            result += st.charAt(i);
        }
       }

       System.out.println(result);
       sc.close();
    }
}