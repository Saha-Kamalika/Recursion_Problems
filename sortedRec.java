package classFiles;
public class sortedRec {
    public static boolean isSorted(int a[],int i)
    {
        if(i==a.length-1)
            return true;
        if(a[i]>=a[i+1])
            return false;
        return isSorted(a,i+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,3};
        if(isSorted(a,0))
            System.out.println("The array is strictly sorted");
        else System.out.println("The array is not strictly sorted");
    }
}
