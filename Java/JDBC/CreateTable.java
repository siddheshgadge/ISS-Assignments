import java.sql.*;  
class CreateTable{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","abc456");  
			System.out.println("Connected");

			Statement stmt = con.createStatement();

			String sql = "create table studentDetails(rno int primary key, name varchar(20))";

			stmt.executeUpdate(sql);

			System.out.println("Successfully created table!");


			con.close();  
	  		System.out.println("DisConnected");
		}catch(Exception e){ System.out.println(e);}

	}  
}