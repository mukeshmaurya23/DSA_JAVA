import java.util.*;

public class Demo2 {
    static public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };

    }
    // static void removeElement(int nums[], int val) {
    // List<Integer> map = new ArrayList<>();
    // for (int i = 0; i < nums.length; i++) {
    // map.add(nums[i]);
    // }
    // for (int i = 0; i < map.size(); i++) {
    // if (map.get(i) == val) {
    // map.remove(i);
    // i--;
    // }
    // }
    // System.out.println(map);

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 17;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        // // call same method using loop
        // int arr[] = twoSum(nums, target);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // removeElement(nums, 7);

        // arrys.toString() is used to print the array in string format and not in the
        // form of hashcode or address of the array in the memory

    }
}
