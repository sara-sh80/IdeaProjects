import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    long[] nums = new long[n];
	    for(int i = 0; i < n; ++i)
	        nums[i] = input.nextLong();

			long max = 0;
			int r = 0;
			for(int j = 0; j < n; ++j){
				if(nums[j] > max){
					max = nums[j];
					r = j;
				}
			}
			if (r == n - 1)
				r = -1;
			System.out.println(r + 1);


    }
}
