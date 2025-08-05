public class Test {

    public static int mystery(int n){
        
        if(n == 0)
           return 1;
        else
           return 2 * mystery(n - 1);  
    }
    public static void main(String args[]){
        System.out.println(mystery(6));

    }
}
