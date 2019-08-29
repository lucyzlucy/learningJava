package schildt;

public class Break {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is " + i);
                        switch (i) {
                            case 1:
                                break one;
                            case 2:
                                break two;
                            case 3:
                                break three;
                            default:
                                System.out.println("won't print");
                        }
                        System.out.println("won't print");
                    }
                    System.out.println("After block 3");
                }
                System.out.println("After block 2");
            }
            System.out.println("After block 1");
        }

        System.out.println("After for");

    }
}
