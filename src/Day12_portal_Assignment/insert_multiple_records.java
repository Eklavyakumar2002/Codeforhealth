//3. Write a program to insert multiple records using JDBC. 
package Day12_portal_Assignment;
import java.util.Scanner;
import java.sql.*;
public class insert_multiple_records {
	public static void main(String args) {
	 Scanner sc = new Scanner(System.in);
     try {

         Class.forName("com.mysql.cj.jdbc.Driver");

         String url = "jdbc:mysql://localhost:3306/student_db";
         String username = "root";
         String password = "Eklavya2002@";
         Connection con = DriverManager.getConnection(url, username, password);
         System.out.println("Database Connected Successfully");
         String query = "INSERT INTO students VALUES (?, ?, ?, ?)";
         PreparedStatement ps = con.prepareStatement(query);
         System.out.print("How many records you want to insert: ");
         int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {

             System.out.println("\nEnter Details of Student " + i);
             System.out.print("Enter ID: ");
             int id = sc.nextInt();
             sc.nextLine();

             System.out.print("Enter Name: ");
             String name = sc.nextLine();

             System.out.print("Enter Age: ");
             int age = sc.nextInt();
             sc.nextLine();

             System.out.print("Enter Course: ");
             String course = sc.nextLine();

             ps.setInt(1, id);
             ps.setString(2, name);
             ps.setInt(3, age);
             ps.setString(4, course);

             int rows = ps.executeUpdate();

             if (rows > 0) {
                 System.out.println("Record Inserted Successfully");
             } else {
                 System.out.println("Record Not Inserted");
             }
         }
         ps.close();
         con.close();
         sc.close();

     } catch (Exception e) {

         System.out.println(e);
     }
 }
}
