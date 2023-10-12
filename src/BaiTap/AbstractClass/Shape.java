package BaiTap.AbstractClass;

public abstract class Shape {
    String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getArea() {

    }

    public void display() {
        System.out.println(color);
    }
}
