package Greedy;

/*
 * Problem: 860. Lemonade Change
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0860_LemonadeChange {

    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                five++;
            } else if (bill == 10) {

                if (five == 0) {
                    return false;
                }

                five--;
                ten++;

            } else {

                if (ten > 0 && five > 0) {

                    ten--;
                    five--;

                } else if (five >= 3) {

                    five -= 3;

                } else {

                    return false;
                }
            }
        }

        return true;
    }
}