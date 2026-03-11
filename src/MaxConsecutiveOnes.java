public class MaxConsecutiveOnes{
    static int maxConsecutiveOnes(int[] arr){
        int count=0;
        int max=0;
        for(int val : nums){
            if(val == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int res=maxConsecutiveOnes(arr);
        System.out.println(res);
    }
}