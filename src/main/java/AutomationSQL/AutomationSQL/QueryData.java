package AutomationSQL.AutomationSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class QueryData {
	public static void main(String[] args) throws Exception{
		Connection con = null;
		String dbUrl = "jdbc:mysql://localhost:3306/automationselenium?useSSL=true";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "root1";
		String password = "root";
		
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(dbUrl, userName, password);
		
		System.out.println("Connection Established Succesfully");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Details");
		
		while(rs.next()) {
			System.out.println("UserNames: "+ rs.getString("UserName")+"---"+("Passwords: "+ rs.getString("Password")+"---"+("Date: "+ rs.getString("Date")+"---"+("Result: "+ rs.getString("Result")+"---"+("Grade: "+ rs.getString("Grade"))))));
		}
		rs.close();
	}
}
