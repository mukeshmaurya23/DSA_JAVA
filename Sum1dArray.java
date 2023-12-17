public class Sum1dArray {
    static int[] sum(int nums[]) {
        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];

        }
        System.out.println(nums[0] = nums[0]);
        System.out.println(nums[1] = nums[1]);
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(java.util.Arrays.toString(sum(nums)));

    }
}
