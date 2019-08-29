package schildt;

public class RecursionStringDemo {
    public static void main(String[] args) {
        String s = RecursionString.Backwards("LiudmylaTuteiko");
        System.out.println(s);
    }
}

class RecursionString {
    static String Backwards(String s){
        return RecursionString.Recurse(s, 0);
    }
    static String Recurse(String v, int n){
        if (n == v.length()-1) {
            return String.valueOf(v.charAt(n));
        }
        return Recurse(v, n + 1) + v.charAt(n);
    }
}
