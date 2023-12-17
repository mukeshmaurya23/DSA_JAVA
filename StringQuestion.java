public class StringQuestion {
    static int strStr(String str1, String str2) {
        // System.out.println(str1.indexOf(str2));
        // print the value of str1 and str2
        System.out.println(str1);
        System.out.println(str2);

        return str1.indexOf(str2);
    }

    public static void main(String[] args) {
        String str1 = "sadbutsad";
        String str2 = "sad";
        System.out.println(strStr(str1, str2));
    }
}