public class PermutationOfString {
    public static void backtrackingString(String str, String per, int idx) {
        if(str.length() == 0) {
            System.out.println(per);
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            backtrackingString(newString, per+currChar, idx+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("The Permutation of " + str + " are: ");
        backtrackingString(str, "", 0);
    }
}
