package schildt;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        String nums[] = {"dbc", "99", "10", "-1", "abc"};
        int a, b;
        String t;
        int size = nums.length;

        System.out.print("Original array is: ");
        for (var num : nums) System.out.print(" " + num);
        System.out.println();

        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1].charAt(0) > nums[b].charAt(0)) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        // display sorted array
        System.out.print("Sorted array is: ");
        for (var num : nums) System.out.print(" " + num);
        System.out.println();

    }
}

