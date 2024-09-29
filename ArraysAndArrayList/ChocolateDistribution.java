package ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChocolateDistribution {
    // Approach: Sort the packets of chocolates, then find the minimum difference
    // between max and min chocolates in every possible group of M packets.
    // TC = O(nlogn) SC= O(1)
    public static int findMinDiff(List<Integer> list, int n, int m) {
        // base cases
        if (list.size() == 0 || m == 0) {
            return 0;
        }
        if(n<m){
            return -1;
        }
        // Sort the chocolate packets to bring similar-sized packets closer together.
        Collections.sort(list);

        int minDiff = Integer.MAX_VALUE;

        // Iterate over the sorted list to find the min difference between the maximum
        // and minimum chocolates in every M packets.
        // i+m-1<n : i = starting 0 , m = students 5, n = total packets of chocolates 8
        for (int i = 0; i + m - 1 < n; i++) {
            // Calculate the difference between the max and min packets
            int diff = list.get(i + m - 1) - list.get(i);

            // Update minDiff if the current difference is smaller than minDiff
            minDiff = Math.min(diff, minDiff);
        }
        return minDiff;
    }

    // Problem Statement -
    // Given an array A[ ] of positive integers of size N, where each value
    // represents the number of chocolates in a packet. Each packet can have a
    // variable number of chocolates. There are M students, the task is to
    // distribute chocolate packets among M students such that :
    // 1. Each student gets exactly one packet.
    // 2. The difference between maximum number of chocolates given to a student and
    // minimum number of chocolates given to a student is minimum.
    public static void main(String[] args) {
        // given - number of chocolates in each packets
        Integer[] A = { 7, 3, 2, 4, 9, 12, 56 };
        List<Integer> chocolates = new ArrayList<>(Arrays.asList(A));
        // n = number of chocolates in each packet, m = number of students
        System.out.println(findMinDiff(chocolates, chocolates.size(), 3));
    }
}
