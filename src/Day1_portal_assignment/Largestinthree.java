//4. Find the largest of three numbers
package Day1_portal_assignment;
import java.util.Scanner;
public class Largestinthree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter a:");
        int b = sc.nextInt();
        System.out.println("enter b:");
        int c = sc.nextInt();
        System.out.println("enter c:");
        if (a > b && a > c)
            System.out.println("Largest is a"+ a);
        else if (b > c)
            System.out.println("Largest is b"+ b);
        else
            System.out.println("Largest is c"+ c);
    }
}