import java.util.Scanner;

public class ScoreOfAString {
    static int scoreOfAString(String str){
        int sum = 0;
        for(int i=0; i<str.length()-1; i++){
            sum += Math.abs(str.charAt(i) - str.charAt(i+1));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int res = scoreOfAString(str);
        System.out.println(res);
    }


}
