import java.util.*;

public class findUnique {
    public boolean uniqueOccurrences(int[] arr) {
        int result[] = new int[arr.length];

        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int visted = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visted++;
                    result[j] = visted;

                }
            }

            System.out.println(arr[i] + " " + visted);

        }
        result = Arrays.stream(result).distinct().toArray();

        for (int i = 0; i < result.length; i++) {
            if (result[i] != result[i + 1]) {
                return true;
            }
        }

        System.out.println(Arrays.toString(result));
        return false;

        // System.out.println("result[" + i + "] = " + result[i]);

        // System.out.println(arr[i] + " occurs " + count + " times");

        // System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 3 };
        // 1 1 2 2 3
        findUnique obj = new findUnique();
        System.out.println(obj.uniqueOccurrences(arr));

    }
}
