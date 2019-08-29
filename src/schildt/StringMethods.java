package schildt;

import java.util.jar.JarOutputStream;

public class StringMethods {
    public static void main(String[] args) {
        String a = "abc";
        String b = "dbca";
        String c = "abc";
        String d = "1abcabc";
        System.out.println(a.length());
        System.out.println(b.equals(a));
        System.out.println(a.equals(c));
        System.out.println(a.charAt(1));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(b));
        System.out.println(d.indexOf(a));
        System.out.println(d.lastIndexOf(a));
        System.out.println(transform(a));
    }

    static String transform(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        return s1;
    }
}
