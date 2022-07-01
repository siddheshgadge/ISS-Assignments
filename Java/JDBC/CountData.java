import java.sql.*;  

class CountData{  
	public static void main(String args[]){

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","abc456");  
			
			System.out.println("Connected");

			String sql = "{? = call f1()}";

			CallableStatement stmt = con.prepareCall(sql);

			stmt.registerOutParameter(1, Types.INTEGER);

			stmt.execute();

			System.out.println("Number of students -> " + stmt.getInt(1));


			con.close();  
	  		System.out.println("DisConnected");
		}catch(Exception e){ System.out.println(e);}

	}  
}