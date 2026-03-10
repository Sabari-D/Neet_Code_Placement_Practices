import java.util.Scanner;

public class ValidAnagram {
    static boolean validAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] res = new int[26];
        for(int i=0; i<str1.length(); i++){
            res[str1.charAt(i) - 'a']++;
            res[str2.charAt(i) - 'a']--;
        }
        for(int count : res){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        boolean res = validAnagram(str1,str2);
        System.out.println(res);
    }
}
