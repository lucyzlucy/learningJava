package schildt;

public class StackDemo {
    public static void main(String[] args) {
        var stack = new Stack(2);
        try {
            stack.put('1');
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            stack.put('2');
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            stack.put('2');
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e);

        }
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e);

        }
        try {
            stack.put('3');
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e);

        }
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println();

        char[] arr = {'a', 'b', 'c'};

        var aa = new Stack(arr);
        try {
            System.out.println(aa.pop());
        } catch (Exception e) {
            System.out.println(e);

        }
        //        System.out.println(aa.pop());
//        aa.put('a');
//        aa.put('a');
//        aa.put('b');
//        aa.put('c');
//        aa.put('c');
//
//        var ab = new Stack(aa);
//        System.out.println(ab.pop());
//        System.out.println(ab.pop());
//        System.out.println(ab.pop());
//        System.out.println(ab.pop());


    }
}

class Stack {
    private char[] q;
    private int putloc;

    Stack(int size) {
        q = new char[size];
        putloc = 0;
    }

    //Create identical queue
    Stack(Stack ob) {
        putloc = ob.putloc;
        q = new char[ob.q.length];
        for (int i = 0; i < putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    //Construct a queue with initial values (insert array into queue)
    Stack(char[] a) {
        putloc = 0;
        q = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                put(a[i]);
                System.out.println(putloc + " " + q.length);
            } catch (StackFullException e) {
                System.out.println(e);
            }
        }
    }

    void put(char ch) throws StackFullException {

        if (putloc == q.length) {
            throw new StackFullException(q.length);
        }
        q[putloc++] = ch;

    }

    char pop() throws StackEmptyException {
        if (putloc == 0) {
            throw new StackEmptyException();
        } else {
            return q[--putloc];
        }
    }
}

class StackFullException extends Exception {
    int s;

    StackFullException(int size) {
        s = size;
    }

    public String toString() {
        return "Stack is full. Required size is " + s;
    }
}


class StackEmptyException extends Exception {
    public String toString() {
        return "Stack is empty";
    }
}
