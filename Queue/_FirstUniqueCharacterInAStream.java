package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue Practice Problem
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class _FirstUniqueCharacterInAStream {

    public char firstUnique(String stream) {

        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();

        for (char c : stream.toCharArray()) {

            freq[c - 'a']++;
            queue.offer(c);

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }
        }

        return queue.isEmpty() ? '#' : queue.peek();
    }
}