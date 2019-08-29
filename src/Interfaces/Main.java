package Interfaces;

public class Main {
    public static void main(String[] args) {
        MyFruits my1 = new MyFruits();
        my1.setFruit(0, 0);
        System.out.println(my1.getFruit());
        MyFruits my2 = new MyFruits();
        my2.setFruit(1, 0);
        System.out.println(my2.getFruit());
        System.out.println(my2.fruit1);
    }
}
