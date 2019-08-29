package qpack;

public interface ICharQ {

    void put(char ch) throws QueueFullException;

    char get() throws QueueEmptyException;

    default void reset() throws ResetException {
        throw new ResetException();
    };

    void setQ(char[] q);

    char[] getQ();

    int getPutloc();

    int getGetloc();

    void setPutloc(int p);

    void setGetloc(int g);

    static ICharQ copy(ICharQ a, ICharQ b) {
        b.setQ(a.getQ());
        b.setPutloc(a.getPutloc());
        b.setGetloc(a.getGetloc());
        return b;
    }

    static ICharQ transform(ICharQ a, String... type) {
        ICharQ c;
        if (type.length == 0) {
            c = new DynQueue(a.getQ().length);
        } else {
            switch (type[0]) {
                case "DynQueue":
                    c = new DynQueue(a.getQ().length);
                case "FixedQueue":
                    c = new FixedQueue(a.getQ().length);
                case "CircularQueue":
                    c = new CircularQueue(a.getQ().length);
                default:
                    c = new DynQueue(a.getQ().length);
            }
        }

        c.setQ(a.getQ());
        c.setPutloc(a.getPutloc());
        c.setGetloc(a.getGetloc());
        return c;
    }


}

//class DynQueueCircular implements ICharQ {
//    private char q[];
//    private int putloc, getloc;
//
//    public DynQueueCircular(int size) {
//        q = new char[size + 1];
//        putloc = getloc = 0;
//    }
//
//    public void reset() {
//        q = new char[q.length];
//        putloc = getloc = 0;
//    }
//
//    public void put(char ch) {
//        if ((putloc == q.length - 1) & (getloc == 0)) {
//            char t[] = new char[q.length + 1];
//            //copy elements into the queue
//            System.arraycopy(q, 0, t, 0, q.length);
//            q = t;
//        } else if (putloc + 1 == getloc) {
//            char t[] = new char[q.length + 1];
//            //copy elements into the queue
//            for (int i = 0; i < q.length + 1; i++) {
//                if (i == getloc) break;
//                t[i] = q[1];
//            }
//            System.arraycopy(q, getloc, t, getloc + 1, q.length - getloc);
//            q = t;
//
//        }
//
//        q[putloc++] = ch;
//        if (putloc == q.length) {
//            putloc = 0;
//        }
//    }
//
//    public char get() {
//        if (getloc == putloc) {
//            System.out.println("Empty");
//            return (char) 0;
//        }
//        char ch = q[getloc++];
//        if (getloc == q.length) {
//            getloc = 0;
//        }
//
//        return ch;
//
//    }
//
//}






