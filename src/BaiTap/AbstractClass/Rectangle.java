package BaiTap.AbstractClass;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Diện tích hình chữ nhật : "+(width*height));
    }

    @Override
    public void display() {
        super.display();
    }
}
