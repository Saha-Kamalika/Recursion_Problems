package classFiles;
public class reverseStringRec {
    public static void printrev(String s,int i){
        if(i==0)
        {
            System.out.println(s.charAt(i));
            return;
        }
        System.out.print(s.charAt(i));
        printrev(s,i-1);
    }
    public static void main(String[] args) {
        String s="bishtu";
        System.out.print(s+"'s reverse is ");
        printrev(s,s.length()-1);
    }
}
//T.C = O(n).... n->length of the string