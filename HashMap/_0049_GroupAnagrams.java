package HashMap;

import java.util.*;

/*
 * Problem: 49. Group Anagrams
 * Difficulty: Medium
 *
 * Time Complexity: O(n × k log k)
 * Space Complexity: O(n × k)
 */

public class _0049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}