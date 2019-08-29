package schildt;

public class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }
    void show(long val){
        var mask = 1L;
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask !=0; mask>>>=1){
            if((val&mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer%8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
class Demo {
    public static void main(String[] args) {
        var b = new ShowBits(8);
        var i = new ShowBits(32);
        var li = new ShowBits(64);
        System.out.println("123 in binary: ");
        b.show(8);
        i.show(8);
        li.show(237658768);
    }
}


