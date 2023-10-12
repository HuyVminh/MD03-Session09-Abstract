package BaiTap.Resizeable;

import java.util.Scanner;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }


    @Override
    public void resize(double percent) {
        this.radius += 0.01 * percent * radius;
    }

    @Override
    public void howToColor() {
        String s = super.isFilled() ? getColor() : "Don't filled color";
    }
}
