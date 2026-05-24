//3. Buffered Reader Usage Write a Java program to read a file using BufferedReader and print only those lines that contain the
//word "Java"
package Day10_portal_assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_readerUses{
    public static void main(String[] args) {
        try {
            BufferedReader dataRead = new BufferedReader(new FileReader("sample.txt"));
            String currentLine;
            while ((currentLine = dataRead.readLine()) != null) {
                if (currentLine.contains("Java")) {
                    System.out.println(currentLine);
                }
            }
            dataRead.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}