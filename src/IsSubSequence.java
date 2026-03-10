import java.util.Scanner;

public class IsSubSequence {
    static boolean isSubsequence(String str1, String str2){
        int i=0, j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == str1.length();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.next();
        String str2=scanner.next();
        boolean res = isSubsequence(str1,str2);
        System.out.println(res);

    }
}
