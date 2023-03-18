package classFiles;
public class moveAllX {
    public static void moveX(String str,int i,int count,String ns){
        if(i==str.length()){
            for(int j=0;j<count;j++)
                ns+='x';
            System.out.println("The new string is "+ns);
            return;
        }
        char curr=str.charAt(i);
        if(curr=='x') {
            count++;
            moveX(str, i + 1, count, ns);
        }
        else{
            ns+=curr;
            moveX(str,i+1,count,ns);
        }
    }
    public static void main(String[] args) {
        String str="kaxxmalixka";
        moveX(str,0,0,"");
    }
}
