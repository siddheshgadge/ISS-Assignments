import java.sql.*;  
class MysqlConnect{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","abc456");  
			System.out.println("Connected");
			con.close();  
	  		System.out.println("DisConnected");
		}catch(Exception e){ System.out.println(e);}

	}  
}