//5.Convert using value of method
package Day6_portal_assignment;

import java.util.Scanner;

public class convert_valueof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter int:");
        int a = sc.nextInt();
        System.out.print("Enter Boolean:");
        boolean c = sc.nextBoolean();
        String x = String.valueOf(a);
        String z = String.valueOf(c);
        System.out.println(x);
        System.out.println(z);
    }
}
