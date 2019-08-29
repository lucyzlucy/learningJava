package schildt;

public class makeObj {

    public static void main(String[] args) {
        var myRef = makeObj1(1);
        if (myRef instanceof B){
            System.out.println("B");
        }

        if (myRef instanceof A){
            System.out.println("A");
        }
    }

    public static A makeObj1 (int which) {
        if(which == 0) return new A();
        else return new B();
    }

}

class A {

}
class B extends A {

}
