package classFiles;
public class placeTiles1xm {
    public static int ways(int n,int m){
        if(n==m)
            return 2;
        if(n<m)
            return 1;
        int hori=ways(n-1,m);
        int ver=ways(n-m,m);
        return hori+ver;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println("No of ways: "+ways(n,m));
    }
}
