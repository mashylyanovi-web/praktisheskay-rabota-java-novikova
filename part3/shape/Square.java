package shape;

public class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setLength(double side) {
        width = side;
        length = side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
