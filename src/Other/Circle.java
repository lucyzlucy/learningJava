package Other;

public class Circle {
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус

    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
    }

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }

    public void zoomCircle(double r) {
        this.r = this.r * r;
    }

    //    Измените в классе Other.Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью, координаты центра и радиус окружности пользователь вводил с клавиатуры.
//    public Other.Circle() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введите координаты центра окружности: ");
//        if (sc.hasNextDouble()) {
//            this.x = sc.nextDouble();
//        }
//
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("Введите координаты центра окружности: ");
//        if (sc1.hasNextDouble()) {
//            this.y = sc1.nextDouble();
//        }
//
//        Scanner sc2 = new Scanner(System.in);
//        System.out.print("Введите радиус окружности: ");
//        if (sc2.hasNextDouble()) {
//            this.r = sc2.nextDouble();
//        }
//    }

    public Circle() {
        x = 1;
        y = 2;
        r = 3;
    }

    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }

    // метод вычисляющий площадь круга
    public double squareCircle() {
        return Math.PI * r * r;
    }

    // метод проверяющий равны ли окружности по площадям
    public boolean equalsCircle(Circle cir) {
        return this.squareCircle() == cir.squareCircle();
    }

    //Создайте в классе Other.Circle метод, вычисляющий длину окружности.
    public double circumferenceCircle() {
        return 2 * Math.PI * r;
    }

    //Создайте в классе Other.Circle метод, перемещающий центр круга в случайную точку квадрата координатной плоскости с диагональю от [-99;-99] до [99;99].
    public void moveCircleRandom() {
        x = (Math.random() * 99 + 99) - 99;
        y = (Math.random() * 99 + 99) - 99;
    }

    //Создайте в классе Other.Circle метод, вычисляющий расстояние между центрами двух окружностей.
    static double distance(Circle a, Circle b) {
        return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
    }

    // Создайте в классе Other.Circle метод, проверяющий, касаются ли окружности в одной точке.
    static boolean touch(Circle a, Circle b) {
        return distance(a, b) == a.r + b.r || distance(a, b) == a.r - b.r;
    }

    public void printQuadrant () {
        if (this.x > 0 && this.y > 0){
            System.out.println("Точка лежит в четверти I");
        }
        else if (this.x < 0 && this.y > 0) {
            System.out.println("Точка лежит в четверти II");
        }
        else if (this.x < 0 && this.y < 0) {
            System.out.println("Точка лежит в четверти III");
        }
        else if (this.x > 0 && this.y < 0) {
            System.out.println("Точка лежит в четверти IV");
        }
        else System.out.println("Точка лежит на оси");
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }


}
