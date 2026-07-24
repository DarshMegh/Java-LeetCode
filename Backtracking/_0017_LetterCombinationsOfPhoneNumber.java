package Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: 17. Letter Combinations of a Phone Number
 * Difficulty: Medium
 *
 * Time Complexity: O(4ⁿ)
 * Space Complexity: O(n)
 */

public class _0017_LetterCombinationsOfPhoneNumber {

    private final String[] mapping = {
            "", "",
            "abc", "def",
            "ghi", "jkl",
            "mno", "pqrs",
            "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.isEmpty()) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), result);

        return result;
    }

    private void backtrack(String digits,
                           int index,
                           StringBuilder current,
                           List<String> result) {

        if (index == digits.length()) {

            result.add(current.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {

            current.append(c);

            backtrack(digits,
                    index + 1,
                    current,
                    result);

            current.deleteCharAt(current.length() - 1);
        }
    }
}