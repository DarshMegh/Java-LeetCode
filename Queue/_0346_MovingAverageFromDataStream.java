package Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Problem: 346. Moving Average from Data Stream
 * Difficulty: Easy
 */

public class _0346_MovingAverageFromDataStream {

    private Queue<Integer> queue;
    private int size;
    private double sum;

    public _0346_MovingAverageFromDataStream(int size) {

        this.size = size;
        queue = new LinkedList<>();
        sum = 0;
    }

    public double next(int val) {

        queue.offer(val);
        sum += val;

        if (queue.size() > size) {
            sum -= queue.poll();
        }

        return sum / queue.size();
    }
}