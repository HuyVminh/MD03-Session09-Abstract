package BaiTap.AbstractClass;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Diện tích hình tròn là " + (radius * radius * Math.PI));
    }

    @Override
    public void display() {
        super.display();
    }
}
