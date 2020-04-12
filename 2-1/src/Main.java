import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] nums = new long[n];
        for(int i = 0; i < n; ++i){
            nums[i] = input.nextLong();
        }
        long N = nums[0];
        int right =0;
        int left = 0;
        for(int i = 0; i < n; ++i){
            long sum = 0;
            long max = nums[i];
            int r = i;
            for(int j = i ; j < n; ++j){
                sum += nums[j];
                if(sum >= max) {
                    r = j;
                    max = sum;
                }
            }
            if (max == N && r - i > right - left) {
                right = r;
                left = i;
            }
            if(max > N) {
                N = max;
                right = r;
                left = i;
            }
        }
        for(int i =left ;i <= right; ++i)
            System.out.print(nums[i] + " ");

    }
}
