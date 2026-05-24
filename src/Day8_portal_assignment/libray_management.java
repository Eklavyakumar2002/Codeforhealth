//3.Library Management Use Map<Book, Boolean> to track availability
package Day8_portal_assignment;

import java.util.*;

public class libray_management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Boolean> library = new HashMap<>();
        library.put("java", true);
        library.put("dsa", true);
        library.put("os", true);
        library.put("dbms", true);

        System.out.println("Available books: " + library.keySet());

        System.out.print("Enter book name to issue: ");
        String bookName = sc.nextLine().toLowerCase();

        if (library.containsKey(bookName)) {
            if (library.get(bookName)) {
                System.out.println("Book issued successfully");
                library.put(bookName, false);
            } else {
                System.out.println("Book already issued");
            }
        } else {
            System.out.println("Book not found");
        }

        sc.close();
    }
}