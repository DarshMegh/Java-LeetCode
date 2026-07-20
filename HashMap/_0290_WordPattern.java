package HashMap;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: 290. Word Pattern
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _0290_WordPattern {

    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch) && !map.get(ch).equals(word)) {
                return false;
            }

            if (reverseMap.containsKey(word) &&
                    reverseMap.get(word) != ch) {
                return false;
            }

            map.put(ch, word);
            reverseMap.put(word, ch);
        }

        return true;
    }
}