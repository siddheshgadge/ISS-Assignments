import java.sql.*;  
import java.io.*;
class UpdateData{  
	public static void main(String args[]){
	
		Console c = System.console();

		int rno = Integer.parseInt(c.readLine("Enter rno to update -> "));
		String name = c.readLine("Enter new name -> ");

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","abc456");  
			
			System.out.println("Connected");

			String sql = "update studentdetails set name = ? where rno = ?";

			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(2,rno);
			stmt.setString(1,name);

			stmt.executeUpdate();

			System.out.println("Successfully updated record!");


			con.close();  
	  		System.out.println("DisConnected");
		}catch(Exception e){ System.out.println(e);}

	}  
}