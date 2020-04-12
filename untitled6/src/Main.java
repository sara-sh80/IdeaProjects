import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is number?");
        int count = input.nextInt();
        //System.out.println("The number is:" + count);
        int[] nums = new int[count];
        System.out.println("What is x?");
        for(int i = 0; i < count; ++i) {
            Scanner in = new Scanner (System.in);
            int x = in.nextInt();
            nums[i] = x ;
        }
        int temp;
        for(int i=0; i<count; ++i)
            for(int j = i+1; j<count; ++j) {
                if(nums[i] > nums[j]){
                   temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
                }
            }
        for (int i:nums)
                System.out.print(i + ",");

    }
}
