package BaiTap.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("red", 5);
        Rectangle r1 = new Rectangle("black", 5, 10);
        c1.getArea();
        c1.display();
        r1.getArea();
        r1.display();
    }
}
