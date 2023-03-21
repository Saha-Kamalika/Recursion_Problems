package classFiles;
import java.util.HashSet;
public class uniqueSubsequence {
    public static void printsubseq(String str,int i,String ns,HashSet<String> set){
        if(i==str.length()){
            if(set.contains(ns))
                return;
            else{
                System.out.println(ns);
                set.add(ns);
                return;
            }
        }
        char curr=str.charAt(i);
        // present
        printsubseq(str,i+1,ns+curr,set);
        //not present
        printsubseq(str,i+1,ns,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        System.out.println("All the unique subsequences are: ");
        printsubseq(str,0,"",set);
    }
}