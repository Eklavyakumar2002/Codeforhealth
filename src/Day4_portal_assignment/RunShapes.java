//2.Default and Static Methods in Interfaces

package Day4_portal_assignment;

interface Shape2D {

    double getArea();

    default double getPerimeter(int... edges) {
        double total = 0;
        for(int e : edges) {
            total += e;
        }
        return total;
    }
    static String info() {
        return "This interface represents basic polygon operations";
    }
}
class RectShape implements Shape2D {

    double len, wid;

    RectShape(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }
    public double getArea() {
        return len * wid;
    }
}
class TriShape implements Shape2D {

    double base, height;

    TriShape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class RunShapes {
    public static void main(String[] args) {

        RectShape rObj = new RectShape(6, 4);
        System.out.println("Rectangle Area = " + rObj.getArea());
        System.out.println("Rectangle Perimeter = " + rObj.getPerimeter(6, 4, 6, 4));

        TriShape tObj = new TriShape(5, 3);
        System.out.println("Triangle Area = " + tObj.getArea());
        System.out.println("Triangle Perimeter = " + tObj.getPerimeter(3, 4, 5));

       System.out.println(Shape2D.info());
    }
}