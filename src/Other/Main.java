package Other;

public class Main {
    public static void main(String[] args) {

//        int MyNumber = 5;
//        String st = "s";
//        String s2 = new String ("t");
//        st = st + MyNumber + s2 + "5";
//        System.out.println(st);
//
//        boolean b = false;
//        b = true;
//
//        boolean toBe = false;
//        b = toBe || !toBe;
//        if (b) {
//            System.out.println(toBe);
//        }
//
//        boolean result = true;
//        result = !result;
//        if (!result){
//            System.out.println(result);
//        }
//        int a = 1;
//        a++;
//        System.out.println(++a);
//        System.out.println(a);
//
//       int d = 5;
//        System.out.println (++d);
//        System.out.println (d++);
//
//        int[] aa; // Объявление массива
//        aa = new int[5]; // Создание массива с заданным размером
//        int[] bb = new int[6]; // Объявление и инициализация
//        String[] s = new String[8];
//        int c = bb.length; // Определение размера массива
//        String[] ss = {"June", "July", "August"}; /* Можно использовать
//        инициализацию и объявление одновременно */
//
//        String name = "1";
//        int name1 = 2;
//        // Следующее вернётся верно, поскольку тип String
//        boolean result1 = name instanceof String;
//        System.out.println( result1 );
//
//        //interesting case - nn is printed 6 times!
//
//        int nn = 0;
//
//        for (int i = 0; nn < 5; nn = i++) {
//            System.out.println(nn);
//        }
//
//        one: //Метка one: К концу какого цикла передается выполнение
//        for (int i = 0; i < 5; i++) {
//            for (int j = 4; j > -1; j--) {
//                if (i > j) {
//                    System.out.println();
//                    continue one; //Управление к концу первого цикла (к метке)
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        Other.Student s1 = new Other.Student();
//        s1.setName("Danielle");
//        s1.setLastName("Black");
//        s1.printFullName();
//        System.out.println(s1.getNumber());
//
//        Other.Point p = new Other.Point(1, 1);
////        p.x = 6;
////        p.y = 4;
//        Other.Point p1 = new Other.Point(1, 1);
//        System.out.println(p.x);
//        System.out.println(p1.y);
//        System.out.println(p1.equals(p));
//        System.out.println(p1.hashCode());
//        System.out.println(p.hashCode());
//


//        System.out.println(p1.center(p).x);
//        System.out.println(p.scale().x + " and " + p.scale().y);
//        System.out.println(p.x + " and " + p.y);
//        System.out.println(p.scaleThis().toString());
//        System.out.println(p.scaleThis().toString());
//
////        p.scaleThis();
//        System.out.println(p.x + " and " + p.y);
//        System.out.println(p.x + " and " + p.y);
//
//        Other.Circle c1 = new Other.Circle(0, 0 , 2);
//        Other.Circle c2 = new Other.Circle(3, 0, 1);
//        Other.Circle c3 = new Other.Circle();
//        System.out.println(Other.Circle.distance(c1, c2));
//        System.out.println(Other.Circle.touch(c1, c2));

//        c1.printCircle();
//        c2.printCircle();
//        c1.printQuadrant();
//        c2.printQuadrant();


//        c1.circumferenceCircle();
//        System.out.println(c1.circumferenceCircle());
//        c1.moveCircleRandom();
//        c1.printCircle();

//        Triangle t = new Triangle();
//        t.print();
        Tria tt = new Tria(1,2,3);
        System.out.println(tt.a + " " + tt.c);


    }
}
