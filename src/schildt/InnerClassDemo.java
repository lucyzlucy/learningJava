package schildt;


public class InnerClassDemo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        var a = new Outer(arr);
        a.analyze();
        var b = new Outer2(arr);
        b.analyze();
    }
}

//Two alternative classes that work the same way 1) with inner class 2) without inner class
class Outer {
    private int[] nums;

    Outer(int[] n) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
    }

    // This is inner class
    class Inner {
        int min() {
            int m = nums[0];

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) m = nums[i];
            }
            return m;
        }
    }
}
class Outer2 {
    private int[] nums;

    Outer2(int[] n) {
        nums = n;
    }

    void analyze() {

        System.out.println("Minimum: " + this.min());
    }

    private int min() {
        int m = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < m) m = nums[i];
        }
        return m;
    }
}
