package movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2,
                            int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

        if (!sameSpeed()) {
            throw new IllegalArgumentException(
                "Points must have the same speed");
        }
    }

    private boolean sameSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
            && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    public void moveUp() {
        if (sameSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    public void moveDown() {
        if (sameSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    public void moveLeft() {
        if (sameSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    public void moveRight() {
        if (sameSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft
            + ", bottomRight=" + bottomRight + "]";
    }
}
