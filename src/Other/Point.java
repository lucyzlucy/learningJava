package Other;

public class Point {
    double x;
    double y;

    Point() {
        this(1, 0);
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point center(Point other) {
        // Возвращает центр между этой и другой точками
        // Заметьте, мы используем целое число, поэтому не получим точное значение
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }

    Point scale() {
        // Возвращает центр между этой и другой точками
        // Заметьте, мы используем целое число, поэтому не получим точное значение

        return new Point( this.x / 2, this.y / 2);
    }

    Point scaleThis() {
        // Возвращает центр между этой и другой точками
        // Заметьте, мы используем целое число, поэтому не получим точное значение

        this.x /= 2;
        this.y /= 2;
        return this;

    }

    static boolean checkCollinearity (Point p1, Point p2, Point p3) {
        return 0.5 * Math.abs((p1.x-p3.x)*(p2.y-p3.y) - (p2.x-p3.x)*(p1.y-p3.y)) == 0;
    }

    @Override
    public String toString() {
        return "[x=" + x + ", y=" + y + "]";
    }

    @Override
    // метод проверяющий совпадают ли точки
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.x == ((Point) obj).x && this.y == ((Point) obj).y;

    }

    @Override
    // метод генерирующий hashCode
    public int hashCode() {
        return 158* (int) this.x * (int) this.y;
    }
}
