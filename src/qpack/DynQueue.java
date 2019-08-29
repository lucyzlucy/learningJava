package qpack;

public class DynQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void setQ(char[] q) {
        char[] a = new char[q.length];
        System.arraycopy(q, 0, a, 0, q.length);
        this.q = a;
    }

    public char[] getQ() {
        return q;
    }

    public int getPutloc() {
        return putloc;
    }

    public int getGetloc() {
        return getloc;
    }

    public void setPutloc(int p) {
        putloc = p;
    }

    public void setGetloc(int g) {
        getloc = g;
    }

    public void reset() {
        q = new char[q.length];
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            //increase queue size
            char t[] = new char[q.length * 2];

            //copy elements into the queue
            System.arraycopy(q, 0, t, 0, q.length);
            q = t;
        }

        q[putloc++] = ch;

    }

    public char get() {
        if (getloc == putloc) {
            System.out.println("Empty");
            return (char) 0;
        }
        return q[getloc++];
    }

}
