package schildt;

public class MultArray {
    public static void main(String[] args) {
        int arr [][] = {
                {1, 2, 3},
                {4},
                {5,6}
        };
        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
// better way for iterating array members
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
