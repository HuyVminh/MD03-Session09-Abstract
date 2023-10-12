package BaiTap.Resizeable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bài 1:
        Circle c1 = new Circle("red", true, 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diện tích hình tròn trước khi tăng : " + c1.getArea());
        System.out.println("Chu vi hình tròn trước khi tăng : " + c1.getPerimeter());
        double percent = Math.round(Math.random() * 99 + 1);
        c1.resize(percent);
        System.out.println("Diện tích hình tròn sau khi tăng " + percent + "% là : " + c1.getArea());
        System.out.println("Chu vi hình tròn sau khi tăng " + percent + "% là : " + c1.getPerimeter());
        // Bài 2:
        Rectangle[] list = new Rectangle[3];
        list[0] = new Square("red", true, 5);
        list[1] = new Rectangle("green", false, 5, 10);
        list[2] = new Square("black", true, 10);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getArea());
            list[i].howToColor();
        }

    }
}
