package schildt;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true; q = true;
        System.out.println((p?1:0) + "\t" + (q?1:0) + "\t" + ((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t" + ((p^q)?1:0) + "\t" + ((!p)?1:0));
        p = true; q = false;
        System.out.println((p?1:0) + "\t" + (q?1:0) + "\t" + ((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t" + ((p^q)?1:0) + "\t" + ((!p)?1:0));
        p = false; q = true;
        System.out.println((p?1:0) + "\t" + (q?1:0) + "\t" + ((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t" + ((p^q)?1:0) + "\t" + ((!p)?1:0));
        p = false; q = false;
        System.out.println((p?1:0) + "\t" + (q?1:0) + "\t" + ((p&q)?1:0) + "\t" + ((p|q)?1:0) + "\t" + ((p^q)?1:0) + "\t" + ((!p)?1:0));



    }
}
