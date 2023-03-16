package classFiles;

public class towerOfHanoi {
    public static void TOH(int n,String src,String helper,String dest)
    {
        if(n==1)
        {
            System.out.println("Move disk 1 from tower "+src+ " to "+dest);
            return;
        }
        TOH(n-1,src,dest,helper);
        System.out.println("Move disk "+n+" from tower "+src+ " to "+dest);
        TOH(n-1,helper,src,dest);
    }
    public static void main(String[] args)
    {
        int n=3;
        TOH(n,"S","H","D");
    }
}

//Time Complexity: O(2^n)
//Recursive eqn: 2T(n-1)+1
