package BaiTap.Resizeable;

public class Square extends Rectangle {
    private double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side += 0.01 * percent + side;
    }

    @Override
    public void howToColor() {
        System.out.println(super.isFilled() ? super.getColor() : "Don't filled color");
    }
}
