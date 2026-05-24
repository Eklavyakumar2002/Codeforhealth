//6.Create Boolean Wrapper usage
package Day6_portal_assignment;

import java.util.Scanner;

public class Boolean_wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter true or false: ");
        String inputVal = sc.next();
        Boolean flag = Boolean.valueOf(inputVal);

        System.out.println("Value: " + flag);
        System.out.println("Type: " + flag.getClass().getSimpleName());
    }
}