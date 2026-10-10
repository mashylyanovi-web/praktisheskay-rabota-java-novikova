import movable.MovablePoint;
import movable.MovableCircle;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println("Точка до: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("Точка после: " + point);

        MovableCircle circle =
            new MovableCircle(1, 2, 3, 4, 5);
        System.out.println("Круг до: " + circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println("Круг после: " + circle);
    }
}
