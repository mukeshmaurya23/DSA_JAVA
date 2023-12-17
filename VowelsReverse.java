public class VowelsReverse {
    public static boolean Vowels(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        } else {
            return false;
        }
    }

    static String returnVowels(String str) {

        int start = 0;
        int end = str.length() - 1;
        char[] arr = str.toCharArray();
        while (start < end) {
            if (!Vowels(arr[start])) {
                start++;
                continue;
            }
            if (!Vowels(arr[end])) {
                end--;
                continue;
            }
            char c = arr[start];
            arr[start] = arr[end];
            arr[end] = c;
            start++;
            end--;

        }
        return new String(arr);

    }

    public static void main(String[] args) {
        String str = "euaio";
        System.out.println(returnVowels(str));
    }
}
