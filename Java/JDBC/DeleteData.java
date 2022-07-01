import java.sql.*;  
import java.io.*;
class DeleteData{  
	public static void main(String args[]){
	
		Console c = System.console();

		int rno = Integer.parseInt(c.readLine("Enter rno to delete -> "));

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","abc456");  
			
			System.out.println("Connected");

			String sql = "delete from studentdetails where rno = ?";

			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1,rno);

			stmt.executeUpdate();

			System.out.println("Successfully deleted record!");


			con.close();  
	  		System.out.println("DisConnected");
		}catch(Exception e){ System.out.println(e);}

	}  
}