package schildt;

class factorial {
    static int factR (int n){
        int result;
        System.out.println(n);

        if(n==1) return 1;
        result = factR(n-1) * n;
        System.out.println(result);

        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial.factR(3));
    }
}

