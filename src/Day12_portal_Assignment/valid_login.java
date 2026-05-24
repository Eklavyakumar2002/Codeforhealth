//2.Create a program to validate login using username & password from database.
package Day12_portal_Assignment;
import java.sql.*;
import java.util.*;

public class valid_login {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            String url = "jdbc:mysql://localhost:3306/student_db";
	            String username = "root";
	            String password = "Eklavya2002@";

	            Connection con = DriverManager.getConnection(url, username, password);

	            System.out.println("Database Connected Successfully");

	            System.out.print("Enter Username: ");
	            String user = sc.nextLine();

	            System.out.print("Enter Password: ");
	            String pass = sc.nextLine();

	            String query = "SELECT * FROM users WHERE username=? AND password=?";

	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setString(1, user);
	            ps.setString(2, pass);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {

	                System.out.println("Login Successful");

	            } else {

	                System.out.println("Invalid Username or Password");
	            }

	            rs.close();
	            ps.close();
	            con.close();
	            sc.close();

	        } catch (Exception e) {

	            System.out.println(e);
	        }
	    }
}
