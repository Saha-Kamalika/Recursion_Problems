package classFiles;
public class keypadCombinations {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char curr=str.charAt(idx);
        String map=keypad[curr-'0'];
        for(int i=0;i<map.length();i++)
            printComb(str,idx+1,combination+map.charAt(i));
    }
    public static void main(String[] args) {
        String str="01";
        System.out.println("All the keypad combinations of "+str+" is ");
        printComb(str,0,"");
    }
}
//T.C = O(max(keypad[].length)^str.length