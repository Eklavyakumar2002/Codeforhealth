// 1.Write a program where a method accepts an integer parameter and tries to change its value.
//	Print the value before and after the method call.
package Day6_portal_assignment;

import java.util.Scanner;
public class methodcall{
    public static void fun(int n) {
        n = n + 10;
        System.out.println("Inside: " + n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        int x = sc.nextInt();
        System.out.println("Before:" + x);
        fun(x);
        System.out.println("After:" + x);
    }
}
