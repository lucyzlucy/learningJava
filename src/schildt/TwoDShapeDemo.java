package schildt;


public class TwoDShapeDemo {
    public static void main(String[] args) {
        TwoDShape a = new Triangle(2, 3, "name");
        a.width = 5;
    }

}

abstract class TwoDShape {
    int width;
    int height;
    TwoDShape (int w, int h){
        width = w;
        height = h;
    }
    TwoDShape () {
        width = 0;
        height = 0;
    }

    abstract int area();
}

class Triangle extends TwoDShape {
    private String name;

    Triangle (int w, int h, String n){
        super(w, h);
        name = n;
    }

    int area() {
        return width * height / 2;
    }
}

class Circle extends TwoDShape {
    int radius;
    Circle (int r){
        radius = r;
    }
    int area() {
        return (int) Math.sqrt(Math.PI*radius);
    }
}


