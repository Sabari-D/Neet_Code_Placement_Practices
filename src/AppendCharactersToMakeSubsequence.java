import java.util.*;
public class Main{
    static int appendedSubsequence(String str1,String str2){
        int i=0, j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length()-j;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();
        int res = appendedSubsequence(str1, str2);
        System.out.println(res);
    }
}