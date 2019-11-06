package JDBCPKG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class oracleconnectioncls {
	public void connectdatabase() throws ClassNotFoundException, SQLException{
		//step1:Load the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Step2:Connect to Database
		Connection cone=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","charan","charan");//(address,username,password)
		
		//step3:Create the Statement
		Statement stm= cone.createStatement();
		
		//step4:Execute the query
		ResultSet result = stm.executeQuery("select * from emp");//retrive the data we use Resultsetonly use for fetching
		
		//Fetch the data
		
		while(result.next())
			//System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getint(4));//result.getint() if the column accept integer value
			System.out.println(result.getString(1)+" "+result.getString(2));
		//close connectivity
		cone.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		oracleconnectioncls obj = new oracleconnectioncls();
		obj.connectdatabase();

	}

}

