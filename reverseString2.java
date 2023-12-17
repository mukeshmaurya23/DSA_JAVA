public class reverseString2 {
    // remove non pallindrome sub string
    static String reverse(String str) {

        int n = str.length();
        int i = 0, j = n - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                break;
            }
        }
        if (i > j) {
            return "";
        }
        String str1 = str.substring(i, j + 1);
        String str2 = str.substring(i, j + 1);
        str2 = reverse(str2);
        if (str1.equals(str2)) {
            return str.substring(0, i) + str.substring(j + 1);
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "abbaeae";
        System.out.println(reverse(str));
    }

}
