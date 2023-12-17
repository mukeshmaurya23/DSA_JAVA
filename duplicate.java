import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 2, 4, 5, 5, 7 };
        Arrays.sort(arr);
        // Set<Integer> st = new HashSet<>();

        // for (int i = 0; i < arr.length; i++) {
        // st.add(arr[i]);
        // }
        // System.out.println(st);

        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[index++] = arr[i];
            }

        }
        arr[index++] = arr[arr.length - 1];
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}
