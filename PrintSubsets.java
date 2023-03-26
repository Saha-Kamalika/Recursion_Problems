package classFiles;
import java.util.ArrayList;
public class PrintSubsets {
    public static void printSub(ArrayList<Integer> s){
        for(int i=0;i<s.size();i++)
            System.out.print(s.get(i)+" ");
        System.out.println();
    }
    public static void findSub(ArrayList<Integer> s,int n)
    {
        if(n==0)
        {
            printSub(s);
            return;
        }
        s.add(n);
        findSub(s,n-1);//add
        s.remove(s.size()-1);
        findSub(s,n-1);
    }
    public static void main(String[] args) {
        int i,n=3;
        ArrayList<Integer> s=new ArrayList<>();
        System.out.print("All the subsets of (");
        for(i=1;i<n;i++)
            System.out.print(i+",");
        System.out.print(i);
        System.out.println(") are: ");
        findSub(s,n);
    }
}
//T.C = O(2^n)
