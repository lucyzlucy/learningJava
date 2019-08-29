package Inheritance;

class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle (double length, double width) { // конструктор
        this.length = length;
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }

}
