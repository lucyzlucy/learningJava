package Other;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 999;
        int num = (int) (Math.random() * (max-min) + min);
        if (num >= 25 && num <= 100) System.out.println("Hooray!");
        System.out.println(num);

        List<Integer> stack = new ArrayList<>();
        while (num > 0) {
            stack.add( num % 10 );
            num = num / 10;
        }

        int a = stack.get(0);
        int b = stack.get(1);
        int c = stack.get(2);

//        if (a >= b){
//            if (a == b){
//                if (a > c){
//                    System.out.println(a);
//                }
//                else {
//                    System.out.println(c);
//                }
//            }
//            else if (a >= c)
//                System.out.println(a);
//        }
//        else if (b >= c){
//            System.out.println(b);
//        }
//        else System.out.println(c);

        System.out.println(Math.max((Math.max(a, b)), c));
    }



}
