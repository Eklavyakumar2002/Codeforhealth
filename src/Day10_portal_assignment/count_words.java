//4.Count Specific Word in File Write a program to count how many times a specific word (e.g., "Java") appears in a file.
package Day10_portal_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class count_words{
    public static void main(String[] args) {
        File myFile = new File("sample.txt");
        String target = "Java";
        int count = 0;
        try {
            Scanner fileScanner = new Scanner(myFile);
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                
                if (word.equalsIgnoreCase(target)) {
                    count++;
                }
            } 
            fileScanner.close();
            System.out.println("Found '" + target + " " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}