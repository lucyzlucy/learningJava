package Interfaces;

interface Fruits extends Apple, Tangerine {
    String fruit1 = "Apple";
    String fruit2 = "Tangerine";
    void setFruit(int number1, int number2);
    String getFruit();
}