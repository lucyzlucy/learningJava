package Other;

import Other.Point;

import java.util.Scanner;

public class Triangle {
    private Point  a;
    private Point  b;
    private Point  c;
    public Triangle() {
        Point point1 = null;
        Point point2 = null;
        Point point3 = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите x и y координати для точки 1 : ");
        if (sc.hasNextDouble()) {
            point1 = new Point(sc.nextDouble(), sc.nextDouble());
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите x и y координати для точки 2 : ");
        if (sc2.hasNextDouble()) {
            point2 = new Point (sc2.nextDouble(), sc2.nextDouble());
        }

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Введите x и y координати для точки 3 : ");
        if (sc3.hasNextDouble()) {
            point3 = new Point (sc3.nextDouble(), sc3.nextDouble());
        }
        if (Point.checkCollinearity(point1, point2, point3)){
            System.out.println("Нельзя задать три вершины, лежащие на одной прямой");
        }
        else {
            this.a = point1;
            this.b = point2;
            this.c = point3;

        }
    }
    public void setTriangle (Point a, Point b, Point c){
        if (Point.checkCollinearity(a, b, c)){
            System.out.println("Нельзя задать три вершины, лежащие на одной прямой");
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

//    public Other.Triangle() {
//        a = new Other.Point(-1, 2);
//        b = new Other.Point(-3, -4);
//        c = new Other.Point(6, -5);
//    }

//    public Other.Triangle() {
//        a = new Other.Point(0, 2);
//        b = new Other.Point(0, 2);
//        c = new Other.Point(0, 2);
//    }

    void print (){
        System.out.println(this.a + "," + this.b + "," + this.c);
    }

    double square (){
        return 0.5 * Math.abs((this.a.x-this.c.x)*(this.b.y-this.c.y) - (this.b.x-this.c.x)*(this.a.y-this.c.y));
    }


}
