package classFiles;
public class totalPathsInMaze {
    public static int count(int i,int j,int n,int m){
        if(i==n || j==m)
            return 0;
        if(i==n-1 || j==m-1)
            return 1;
        int right=count(i,j+1,n,m); //right movement
        int down=count(i+1,j,n,m); //downward movement
        return right+down;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println("Total number of paths from 0,0 to "+m+","+n+" is "+count(0,0,n,m));
    }
}
