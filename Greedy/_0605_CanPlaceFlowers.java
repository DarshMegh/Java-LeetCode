package Greedy;

/*
 * Problem: 605. Can Place Flowers
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class _0605_CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean leftEmpty =
                        (i == 0 || flowerbed[i - 1] == 0);

                boolean rightEmpty =
                        (i == flowerbed.length - 1 ||
                                flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {

                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}