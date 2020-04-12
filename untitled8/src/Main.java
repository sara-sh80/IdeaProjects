public class Main {
    static void myMethod(int[] nums) {
        for(int j:nums)
            System.out.print(j + ",");
        System.out.println();
        int x = nums.length , temp;
        for(int i = 0; i< (int)nums.length/2; ++i){
            temp = nums[i];
            nums[i] = nums[x-1];
            nums[x-1] = temp;
            x = x - 1;
        }
        for(int i:nums)
            System.out.print(i + ",");
    }
    public static void main(String[] args) {
        int[] nums = {1 , 6 , 3 , 8 , 1 , 7 , 9};
        myMethod(nums);
    }
}
