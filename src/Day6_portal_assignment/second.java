//2.Create a class Box with a variable length. Write a method that modifies the value of length by passing
//the Box object. Show that the original object is modified.
package Day6_portal_assignment;
import java.util.Scanner;

class Box {
    int length;
    void updateLength(Box box) {
        box.length = box.length + 30;
        System.out.println("Inside method:" + box.length);
    }
}
public class second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();
        System.out.print("Enter length: ");
        box.length = sc.nextInt();
        System.out.println("Before method:" + box.length);
        box.updateLength(box);
        System.out.println("After method:" + box.length);
    }
}