//3.Check if character is a Digit
package Day6_portal_assignment;

import java.util.Scanner;

public class chech_ch_isDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char z = sc.next().charAt(0);
        if (Character.isDigit(z)) {
            System.out.println("It is a digit");
        } else {
            System.out.println("It is not a digit");
        }
    }
}