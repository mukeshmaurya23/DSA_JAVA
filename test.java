import java.util.Arrays;

import java.util.Collections;

public class test {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        // an array of reverse sorted ints
        int[] arrDesc = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(arrDesc));
    }
}
