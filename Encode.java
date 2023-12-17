public class Encode {

    public static void main(String[] args) {

        String s = "Where are you? Meet me near the clock tower";
        String[] words = s.split(" "); // split the string into words
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            // System.out.println(word);
            if (i % 3 == 0) { // every third word (including the first)
                result += word.replaceAll("[aeiouAEIOU]", "%");
            } else if (i % 3 == 1) { // every third word + 1
                result += word.replaceAll("[^aeiouAEIOU]", "#");
            } else { // every third word + 2
                result += word.toUpperCase();
            }

        }
        System.out.println(result);

    }
}