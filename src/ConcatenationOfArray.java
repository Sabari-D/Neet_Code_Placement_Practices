import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray {
    static int[] concatenatedArray(int[] arr){
        int n = arr.length;
        int[] res = new int[2*n];
        for(int i=0; i<n; i++){
            res[i] = arr[i];
            res[i+n] = arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int[] res = concatenatedArray(arr);
        System.out.println(Arrays.toString(res));
    }
}
