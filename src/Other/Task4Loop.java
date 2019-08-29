package Other;

public class Task4Loop {
    public static void main(String[] args) {
        for (int i=2; i<=237; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
            ++i;
        }

        int [] arr = {100, 25, 30, 80, 2, 237, 6, 258};
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 237){
                break;
            }
            if (arr[i] % 2 != 0){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
