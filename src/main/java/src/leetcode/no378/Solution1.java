package src.leetcode.no378;

import java.util.PriorityQueue;

/**
 * Given a n x n matrix where each of the rows and columns are sorted in ascending order, find the kth smallest element in the matrix.
 * <p>
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 * <p>
 * Example:
 * <p>
 * matrix = [
 * [ 1,  5,  9],
 * [10, 11, 13],
 * [12, 13, 15]
 * ],
 * k = 8,
 * <p>
 * return 13.
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ n2.
 */
public class Solution1 {

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Tuple> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(new Tuple(0, i, matrix[0][i]));
        }
        for (int i = 0; i < k-1; i++) {
            Tuple tuple = pq.poll();
            //System.out.println("matrix value = [" + tuple.value + "]");
            if (tuple.x == n - 1) {
                continue;
            }
            pq.offer(new Tuple(tuple.x + 1, tuple.y, matrix[tuple.x + 1][tuple.y]));
            System.out.println("matrix = [" + pq + "]");
        }


        return pq.poll().value;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[][] matrix = new int[][]{
                {1, 5,9}, {10, 11, 13}, {12, 13, 15}
        };
        System.out.println("args = [" + solution1.kthSmallest(matrix, 8) + "]");

    }
}

class Tuple implements Comparable<Tuple> {

    public int x;
    public int y;
    public int value;

    public Tuple(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    @Override
    public int compareTo(Tuple o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return "this value is : {} " + this.value;

    }
}
