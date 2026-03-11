public class Main{
    static int lastWordLength(String str){
        int length = 0;
        int i=str.length()-1;
        while(i>=0 && str.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && str.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        int res = lastWordLength(str);
        System.out.println(res);
    }
}