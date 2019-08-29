package schildt;

class Test {
    int a;

    Test (){
        this.a = 5;
    }

    Test (int a){
        this.a = a;
    }

    void change (Test a){
        a.a += 5;
    }
}

class TestTest {
    public static void main(String[] args) {
        var a = new Test();
        var b = new Test();
        double bb = 1.5;
        var bc = new Test((int)bb);
        System.out.println(bc.a);
        System.out.println(a.a + " " + b.a);
        a.change(a);
        System.out.println(a.a + " " + b.a);
    }
}
