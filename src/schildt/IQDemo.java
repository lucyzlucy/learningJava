package schildt;


import qpack.*;

public class IQDemo {

    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(2);
        CircularQueue q2 = new CircularQueue(4);
//        CircularQueue q3 = new CircularQueue(10);
//        DynQueueCircular q4 = new DynQueueCircular(10);
//
//
//        ICharQ iQ;


        try {
            q1.put('a');
            q1.put('b');
            q1.put('b');

        } catch (QueueFullException e) {
            System.out.println(e);
        }
        ICharQ q3 = ICharQ.transform(q1);
        try {
            System.out.println(q1.get());
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
        try {

            System.out.println(q1.get());
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }
        try {

            System.out.println(q1.get());
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }


        try {
            q1.reset();
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println();


        ICharQ.copy(q1, q2);






//        char ch;
//        int i;

//        iQ = q1;


//        // Put some characters into fixed queue.
//        for (i = 0; i < 10; i++) {
//            iQ.put((char) ('A' + i));
//        }
////
//        // Show the queue.
//        System.out.print("Contents of fixed queue: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//        System.out.println();
//
//        iQ = q2;
//        // Put some characters into dynamic queue.
//        for (i = 0; i < 10; i++) {
//            iQ.put((char) ('Z' - i));
//        }
//
//        // Show the queue.
//        System.out.print("Contents of dynamic queue: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        iQ = q3;
//        // Put some characters into circular queue.
//        for (i = 0; i < 10; i++) {
//            iQ.put((char) ('A' + i));
//        }
//
//        // Show the queue.
//        System.out.print("Contents of circular queue: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        // Put more characters into circular queue.
//        for (i = 10; i < 20; i++) {
//            iQ.put((char) ('A' + i));
//        }
//
//        // Show the queue.
//        System.out.print("Contents of circular queue: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println("\nStore and consume from"
//                + " circular queue.");
//
//        // Use and consume from circular queue.
//        for (i = 0; i < 20; i++) {
//            iQ.put((char) ('A' + i));
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        iQ = q4;
//        // Put some characters into dynamic queue.
//        iQ.put(('a'));
//        iQ.put(('b'));
//        iQ.put(('c'));
//
//        System.out.println(iQ.get());
//        System.out.println(iQ.get());
//        System.out.println(iQ.get());
//        iQ.put(('d'));
//        iQ.put(('e'));
//        System.out.println(iQ.get());
//        iQ.put(('e'));
//        iQ.put(('f'));
//        System.out.println(iQ.get());
//        System.out.println(iQ.get());
//        System.out.println(iQ.get());
//        System.out.println(iQ.get());
//
//        // Put some characters into circular queue.
//        for (i = 0; i < 10; i++) {
//            iQ.put((char) ('A' + i));
//        }
//
//        // Show the queue.
//        System.out.print("Contents of circular queue: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
//        // Put more characters into circular queue.
//        for (i = 10; i < 20; i++) {
//            iQ.put((char) ('A' + i));
//        }
//
//        // Show the queue.
//        System.out.print("Contents of circular queue: ");
//        for (i = 0; i < 10; i++) {
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println("\nStore and consume from"
//                + " circular queue.");
//
//        // Use and consume from circular queue.
//        for (i = 0; i < 20; i++) {
//            iQ.put((char) ('A' + i));
//            ch = iQ.get();
//            System.out.print(ch);
//        }
//
//        System.out.println();
//
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






