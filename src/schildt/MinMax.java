package schildt;

public class MinMax {
    public static void main(String[] args) {
        int nums[] = {99, -1, 1000, 9};
        int min, max;
        min = max = nums[0];
        for (var x : nums) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println("Min: " + min + " max " + max);
    }
}
