import java.util.*;

public class AnagramStringArray {
    public String[] groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return map.values().toArray(new String[0][]);

        // for loop

    }

    // System.out.print();
    // return "No anagram found";

    public static void main(String[] args) {
        String str[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        AnagramStringArray obj = new AnagramStringArray();
        System.out.println(obj.groupAnagrams(str));

    }
}
