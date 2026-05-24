//4. Create a program to display all records from students table.
package Day12_portal_Assignment;
import java.util.*;
import java.sql.*;
public class DisplayStudents {
	    public static void main(String[] args) {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/student_db",
	                    "root",
	                    "Eklavya2002@");

	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery("SELECT * FROM students");

	            while (rs.next()) {
	                System.out.println(
	                        rs.getInt(1) + " " +
	                        rs.getString(2) + " " +
	                        rs.getInt(3) + " " +
	                        rs.getString(4));
	            }
	            con.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
}
