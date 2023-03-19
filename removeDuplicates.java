package classFiles;
public class removeDuplicates {
    public static boolean[] map=new boolean[26];
    public static void removeDup(String str,int i,String ns){
        if(i==str.length()){
            System.out.println("After removing the duplicates, the string is "+ns);
            return;
        }
        char curr=str.charAt(i);
        if(map[curr-'a'])
            removeDup(str,i+1,ns);
        else{
            ns+=curr;
            map[curr-'a']=true;
            removeDup(str,i+1,ns);
        }
    }
    public static void main(String[] args) {
        String str="kkkkaaammmmaaallllikkkkkaaa";
        removeDup(str,0,"");
    }
}
