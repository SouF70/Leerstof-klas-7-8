package org.example;

public class Rectangle {

    public double length;
    public double width;
    private double area;

    public Rectangle(final double length, final double width){
        this.width = width;
        this.length = length;
        area = length * width;
        calcArea();
    }

    private void calcArea(){
        area = length * width;
    }

    public void setLength(double length) {
        this.length = length;
        area = length * width;
    }

    public void setWidth(double width) {
        this.width = width;
        area = width * width;
        calcArea();
    }

    public double getArea(){
        return area;
    }
}
