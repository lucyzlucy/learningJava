package schildt;

public class SuperSub {
    int a;

    SuperSub(int a) {
        this.a = a;
    }
}

class Sub extends SuperSub {
    int b;

    Sub(int b) {
        super(b);
        this.a = 5;
    }
}

class SubSub extends Sub {
    int a;

    SubSub(int c, int d) {
        super(c);
        this.b = d;
        this.a = super.a;
    }

    void show() {
        System.out.println(super.a);
        System.out.println(a);
    }
}

class aaa {
    public static void main(String[] args) {
        var a = new SubSub(2, 3);
        System.out.println(a.a + " " + a.b);
        var b = new SuperSub(3);



    }
}
