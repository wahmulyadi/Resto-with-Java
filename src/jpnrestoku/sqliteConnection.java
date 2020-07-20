package jpnrestoku;
import java.sql.*;
import javax.swing.*;
public class sqliteConnection {
	Connection conn = null;
	public static Connection dbConnector()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/resto","root","");
		return conn;
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		return null;
		}
	}
	
	
}
