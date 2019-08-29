package schildt;

public class QuicksortDemo {
    public static void main(String[] args) {
        char[] a = {'4', '2', '5', '1', '6', '7'};
        for (var x : a) {
            System.out.print(x);
        }
        System.out.println();
        Quicksort.qsort(a);
        for (var x : a) {
            System.out.print(x);
        }
    }
}

class Quicksort {
    static void qsort(char items[]) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char items[], int left, int right) {
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) i++;
            System.out.print(items[i]+ " ");
            while ((x < items[j]) && (j > left)) j--;
            System.out.println(items[j]);


            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) qs(items, left, j);
        if (i < right) qs(items, i, right);
    }

}
