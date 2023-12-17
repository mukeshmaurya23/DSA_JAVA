
import java.util.Arrays;
import java.util.*;
import java.util.Collections;

public class oddOccurance {
    static int[] oddOccuranceProblem(int[] nums, int n) {
        int result[] = new int[n];
        int index = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(nums[i]);

        }
        // count the frequency of each element
        for (int i = 0; i < n; i++) {
            int count = Collections.frequency(list, nums[i]);
            if (count % 2 != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        // int inexe = 0; // index for result array

        result = Arrays.stream(result).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).distinct().filter(i -> i != 0).toArray();

        System.out.println(Arrays.toString(result));

        return result;
        // return Arrays.stream(result).filter(i -> i !=
        // 0).sorted(Collections.reverseOrder()).toArray();

    }

    public static void main(String[] args) {
        int[] nums = { 1, 7, 5, 7, 5, 4, 7, 4 };
        int n = 8;
        System.out.println(Arrays.toString(oddOccuranceProblem(nums, n)));
        // System.out.println(java.util.Arrays.toString(oddOccuranceProblem(nums, n)));
    }
}
/*
 * int result[] = new int[n];
 * int index = 0;
 * // int inexe = 0; // index for result array
 * for (int i = 0; i < n; i++) {
 * int count = 0;
 * for (int j = 0; j < n; j++) {
 * if (nums[i] == nums[j]) {
 * count++;
 * }
 * }
 * if (count % 2 != 0) {
 * // System.out.print(count + " ");
 * // System.out.print(nums[i]);
 * 
 * result[index] = nums[i];
 * // System.out.println("result[" + index + "] = " + result[index]);
 * index++;
 * }
 * 
 * }
 * result = Arrays.stream(result).boxed()
 * .sorted(Collections.reverseOrder())
 * .mapToInt(Integer::intValue).distinct().filter(i -> i != 0).toArray();
 * return result;
 */