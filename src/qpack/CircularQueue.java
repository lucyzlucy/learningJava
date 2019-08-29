package qpack;

public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void setQ(char[] q) {
        System.arraycopy(q, 0, this.q, 0, q.length);
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

    public void put(char ch) throws QueueFullException {
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            throw new QueueFullException(q.length);

        }

        q[putloc++] = ch;
        if (putloc == q.length) {
            putloc = 0;
        }
    }

    public char get() throws QueueEmptyException {
        if (getloc == putloc) {
            throw new QueueEmptyException();

        }
        char ch = q[getloc++];
        if (getloc == q.length) {
            getloc = 0;
        }

        return ch;

    }
}
