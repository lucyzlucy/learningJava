package schildt;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(2);
        bigQ.put('1');
        bigQ.put('2');
        System.out.println(bigQ.get());
        System.out.println(bigQ.get());
        bigQ.put('3');
        System.out.println(bigQ.get());

        Queue1 bigQ1 = new Queue1(2);
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


    }
}

class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Full");
            return;
        }
        q[putloc++] = ch;

    }

    char get() {
//        if(putloc == 0){
//            System.out.println("Empty");
//            return (char) 0;
//        }
//        char getChar = q[0];
//        for (int i=0; i<=putloc; i++){
//            q[i] = q[i+1];
//        }
//        return getChar;
        if (getloc == putloc) {
            System.out.println("Empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class Queue1 {
    char q[];
    int putloc, getloc;

    Queue1(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println("Full");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(putloc == 0){
            System.out.print("Empty");
            return 0;
        }
        char getChar = q[0];
        if (putloc - 1 >= 0) System.arraycopy(q, 1, q, 0, putloc - 1);
//        for (int i=0; i<putloc-1; i++){
//            q[i] = q[i+1];
//        }
        putloc--;
        return getChar;

    }
}
