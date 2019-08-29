package Interfaces;

public class MyFruits  implements Fruits {
    String color;
    String name;

    private String getColor() {
        return color;
    }

    private void setColor(int number) {
        switch (number) {
            case 0:
                this.color = this.red;
                break;
            case 1:
                this.color = this.yellow;
                break;
            default:
                this.color = this.green;
        }
    }

    public String getFruit() {
        String s = "Fruit: " + this.name + "Color: " + getColor();
        return s;
    }

    public void setFruit(int number1, int number2) {
        switch (number1) {
            case 0:
                this.name = this.fruit1;
                setColor(number2);
                break;
            default:
                this.name = this.fruit2;
                this.color = this.orange;
                break;
        }
    }
}
