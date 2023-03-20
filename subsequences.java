package classFiles;
public class subsequences {
    public static void printsubseq(String str,int i,String ns){
        if(i==str.length()){
            System.out.println(ns);
            return;
        }
        char curr=str.charAt(i);
        // present
        printsubseq(str,i+1,ns+curr);
        //not present
        printsubseq(str,i+1,ns);
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println("All the subsequences are: ");
        printsubseq(str,0,"");
    }
}
//T.C = O(2^n)