package classFiles;
public class Permutations {
    public static void printPermutation(String str,String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String ns = str.substring(0, i) + str.substring(i + 1);
            printPermutation(ns, perm + curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println("All the permutations of the given string are: ");
        printPermutation(str,"");
    }
}
//T.C: O(n!)