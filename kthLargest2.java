import java.util.Arrays;

public class kthLargest2 {
    static int kthLargest(int arr[], int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];

    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 3, 67 }; // 4 length //3 6 9 67 4-2=2
        int k = 2;
        System.out.println(kthLargest(arr, k));
    }

}
