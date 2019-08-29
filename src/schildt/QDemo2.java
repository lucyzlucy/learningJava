package schildt;

public class QDemo2 {
    public static void main(String[] args) {
        var bigQ = new Queue2(2);
        bigQ.put('1');
        bigQ.put('2');
        System.out.println(bigQ.get());
        System.out.println(bigQ.get());
        bigQ.put('3');
        System.out.println(bigQ.get());

        var bigQ1 = new Queue12(2);
        bigQ1.put('1');
        bigQ1.put('2');
        System.out.println(bigQ1.get());
        System.out.println(bigQ1.get());
        bigQ1.put('3');
        System.out.println(bigQ1.get());
        System.out.println(bigQ1.get());
        bigQ1.put('1');
        System.out.println(bigQ1.get());
        System.out.println(bigQ1.get());
        char[] arr = {'a', 'b', 'c'};

        var aa = new Queue12(arr);
        System.out.println(aa.get());
        System.out.println(aa.get());
        System.out.println(aa.get());
        System.out.println(aa.get());
        aa.put('a');
        aa.put('b');
        aa.put('c');
        aa.put('c');

        var ab = new Queue12(aa);
        System.out.println(ab.get());
        System.out.println(ab.get());
        System.out.println(ab.get());
        System.out.println(ab.get());





    }
}

class Queue2 {
    private char[] q;
    private int putloc, getloc;

    Queue2(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    //Create identical queue
    Queue2(Queue2 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        for (int i = getloc; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    //Construct a queue with initial values (insert array into queue)
    Queue2(char[] a) {
        putloc = getloc = 0;
        q = new char[a.length];
        for (int i = getloc; i < a.length; i++) {
            put(a[i]);
        }
    }


    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Full");
            return;
        }
        q[putloc++] = ch;

    }

    char get() {
        if (getloc == putloc) {
            System.out.println("Empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class Queue12 {
    private char[] q;
    private int putloc;

    Queue12(int size) {
        q = new char[size];
        putloc = 0;
    }

    //Create identical queue
    Queue12(Queue12 ob) {
        putloc = ob.putloc;
        q = new char[ob.q.length];
        for (int i = 0; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    //Construct a queue with initial values (insert array into queue)
    Queue12(char[] a) {
        putloc = 0;
        q = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Full");
            return;
        }
        q[putloc++] = ch;

    }

    char get() {
        if (putloc == 0) {
            System.out.print("Empty");
            return 0;
        }
        else{
            char getChar = q[0];
            System.arraycopy(q, 1, q, 0, putloc - 1);
            putloc--;
            return getChar;

        }
    }
}
