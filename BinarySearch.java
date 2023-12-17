// class BinarySearch {
//     public static void main(String[] args) {

//         int[] arr = { 1, 5, 7, 8, 67, 23 };
//         int userNumbr = 2;

//         for (int i = 0; i < arr.length; i++) {
//             if (i== userNumbr) {
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(arr, target));
    }

}
