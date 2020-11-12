package com.pboreg;

public class Rectangle extends  Shape{
    private int lenght, width;

    public Rectangle(int lenght, int width){
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        return lenght*width;
    }

    public String toString() {
        return "Rectangle";
    }
}
