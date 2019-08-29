package qpack;

public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
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


//    // Copy from one queue into another
//    static FixedQueue copy(FixedQueue a) {
//        FixedQueue b = new FixedQueue(a.q.length);
//        //copy elements into the queue
//        System.arraycopy(a.q, 0, b.q, 0, a.q.length);
//        return b;
//    }

//    public void reset() {
//        q = new char[q.length];
//        putloc = getloc = 0;
//    }

    public void put(char ch) throws QueueFullException {
        if (putloc == q.length) {
            throw new QueueFullException(q.length);
        }
        q[putloc++] = ch;

    }

    public char get() throws QueueEmptyException {
//        return getChar;
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }

}
