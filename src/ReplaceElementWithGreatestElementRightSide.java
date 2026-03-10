import java.util.Arrays;
import java.util.Scanner;

public class ReplaceElementWithGreatestElementRightSide {
    static int[] replacedArray(int[] arr){
        int n=arr.length;
        int right = -1;
        for(int i=n-1; i>=0; i--){
            int current = arr[i];
            arr[i] = right;
            right = Math.max(right, current);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int[] res = replacedArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
