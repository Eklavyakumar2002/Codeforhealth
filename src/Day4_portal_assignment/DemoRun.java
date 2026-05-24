//1.1. Moveable Shapes Simulation
package Day4_portal_assignment;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class PointMove implements Movable {
    int posX, posY, speedX, speedY;

    PointMove(int posX, int posY, int speedX, int speedY) {
        this.posX = posX;
        this.posY = posY;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void moveUp() {
        posY += speedY;
    }

    public void moveDown() {
        posY -= speedY;
    }

    public void moveLeft() {
        posX -= speedX;
    }

    public void moveRight() {
        posX += speedX;
    }

    public String toString() {
        return "Point(" + posX + "," + posY + ")";
    }
}

class CircleMove implements Movable {
    int rad;
    PointMove centerPoint;

    CircleMove(int rad, PointMove centerPoint) {
        this.rad = rad;
        this.centerPoint = centerPoint;
    }

    public void moveUp() {
        centerPoint.moveUp();
    }

    public void moveDown() {
        centerPoint.moveDown();
    }

    public void moveLeft() {
        centerPoint.moveLeft();
    }

    public void moveRight() {
        centerPoint.moveRight();
    }

    public String toString() {
        return "Circle center " + centerPoint + " radius " + rad;
    }
}

class RectangleMove implements Movable {
    PointMove corner1;
    PointMove corner2;

    RectangleMove(PointMove corner1, PointMove corner2) {
        if (corner1.speedX == corner2.speedX && corner1.speedY == corner2.speedY) {
            this.corner1 = corner1;
            this.corner2 = corner2;
        } else {
            System.out.println("Speed mismatch");
        }
    }

    public void moveUp() {
        corner1.moveUp();
        corner2.moveUp();
    }

    public void moveDown() {
        corner1.moveDown();
        corner2.moveDown();
    }

    public void moveLeft() {
        corner1.moveLeft();
        corner2.moveLeft();
    }

    public void moveRight() {
        corner1.moveRight();
        corner2.moveRight();
    }

    public String toString() {
        return "Rectangle " + corner1 + " to " + corner2;
    }
}

public class DemoRun {
    public static void main(String[] args) {

        PointMove pA = new PointMove(1, 2, 1, 1);
        System.out.println(pA);
        pA.moveRight();
        pA.moveUp();
        System.out.println(pA);

        CircleMove cA = new CircleMove(3, new PointMove(0, 0, 2, 2));
        System.out.println(cA);
        cA.moveUp();
        cA.moveRight();
        System.out.println(cA);

        PointMove r1 = new PointMove(0, 0, 1, 1);
        PointMove r2 = new PointMove(5, 5, 1, 1);

        RectangleMove rect = new RectangleMove(r1, r2);
        System.out.println(rect);
        rect.moveLeft();
        rect.moveDown();
        System.out.println(rect);
    }
}