package classFiles;
public class CallGuests {
    public static int callGuests(int n)
    {
        if(n<=1)
            return 1;
        int w1=callGuests(n-1); //single
        int w2=callGuests(n-2)*(n-1); //pairs;
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Total ways to call "+n+" guests is "+callGuests(n));
    }
}
