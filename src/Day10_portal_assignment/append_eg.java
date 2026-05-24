//2.Append Data to File Write a program to: Take user input Append that data into an existing file without deleting previous content
package Day10_portal_assignment;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class append_eg{
    public static void main(String[] args) {
        String fileName = "notes.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to append: ");
        String userInput = scanner.nextLine();

        try (FileWriter fw = new FileWriter(fileName, true);
             PrintWriter out = new PrintWriter(fw)) {
            
            out.println(userInput);
            System.out.println("Data appended successfully.");
            
        } catch (IOException e) {
            System.err.println("Whoops, couldn't write to the file: " + e.getMessage());
        }
    }
}