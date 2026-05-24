//1.Write a Java program to read a text file and count: Number of lines Number of words Number of characters
package Day10_portal_assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class count_textfile{
    public static void main(String[] args) {
        int totalLines = 0;
        int totalWords = 0;
        int totalCharacters = 0;

        try {
            BufferedReader readerData = new BufferedReader(new FileReader("sample.txt"));
            String lineData;
            while ((lineData = readerData.readLine()) != null) {
                totalLines++;
                totalCharacters += lineData.length();
                String data[] = lineData.split(" ");
                totalWords += data.length;
            }
            readerData.close();
            System.out.println("Number of Lines :" + totalLines);
            System.out.println("Number of Words :" + totalWords);
            System.out.println("Number of Characters :" + totalCharacters);
        }
        catch (IOException e) {
            System.out.println("Problem while reading file");
        }
    }
}
