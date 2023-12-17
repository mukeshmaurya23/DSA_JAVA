import java.util.Arrays;

public class convertTo69 {
    static int program69(int nums) {
        String numString = Integer.toString(nums);
        return Integer.parseInt(numString.replaceFirst("6", "9"));

    }

    public static void main(String[] args) {
        int nums = 9669;
        System.out.println(program69(nums));

    }
}
