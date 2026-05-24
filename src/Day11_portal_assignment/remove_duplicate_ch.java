//2.Remove duplicate characters from string.
package Day11_portal_assignment;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class remove_duplicate_ch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
