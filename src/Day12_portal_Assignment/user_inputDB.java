//1.Create a program to store user input data into database using Scanner and JDBC.
package Day12_portal_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class user_inputDB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/student_db";
            String username = "root";
            String password = "Eklavya2002@";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course Name: ");
            String course = sc.nextLine();

            String query = "INSERT INTO students VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, course);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Data Inserted Successfully");
            } else {
                System.out.println("Data Not Inserted");
            }

            ps.close();
            con.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
