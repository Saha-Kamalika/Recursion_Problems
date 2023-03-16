package classFiles;
public class occurrenceRec {
    public static int first=-1,last=-1;
    public static void occurrence(String s,int i,char c){
        if(i==s.length()){
            System.out.println("First occurrence of "+c+" is at index "+first);
            System.out.println("Last occurrence of "+c+" is at index "+last);
            return;
        }
        char cc=s.charAt(i);
        if(cc==c){
            if(first==-1)
                first=i;
            else last=i;
        }
        occurrence(s,i+1,c);
    }
    public static void main(String[] args) {
        String s="kamalika";
        occurrence(s,0,'a');
    }
}
