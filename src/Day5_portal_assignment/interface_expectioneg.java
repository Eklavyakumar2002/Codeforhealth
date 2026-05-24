//3. Write a program where an interface is implemented and exception handling is used inside the method.
package Day5_portal_assignment;
import java.util.Scanner;
interface AgeCheck {
    void checkAge(int age);
}

class Person implements AgeCheck {
    public void checkAge(int age) {
        try {
            if (age < 18) {
                throw new Exception("You are not eligible");
            }
            System.out.println("You are eligible");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
public class interface_expectioneg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userAge = input.nextInt();
        Person obj = new Person();
        obj.checkAge(userAge);
        input.close();
    }
}