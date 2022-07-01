import java.sql.*;  
class ReadData{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","abc456");  
			System.out.println("Connected");

			Statement stmt = con.createStatement();

			String query = "select * from studentdetails";

			ResultSet rs = stmt.executeQuery(query);

			System.out.println("Data -> ");

			while(rs.next()){
				System.out.println("Roll No. -> " + rs.getInt("rno"));
				System.out.println("Name -> " + rs.getString("name"));
			}


			con.close();  
	  		System.out.println("Disconnected");
		}catch(Exception e){ System.out.println(e);}

	}  
}