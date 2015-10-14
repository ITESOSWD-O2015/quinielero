import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class sqliteConnection {

	Connection dbcon =null;
	
	public static Connection dbConnector (){
		try {
			Class.forName("org.sqlite.JDBC");
			Connection dbcon = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Paloma\\workspace\\PoolMode\\Pools.sqlite");
			JOptionPane.showMessageDialog(null, "Connection succesfull");
			return dbcon;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
