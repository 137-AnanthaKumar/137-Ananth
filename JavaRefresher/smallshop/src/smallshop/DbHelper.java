package smallshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHelper {
	
	public void insertData(String tak, int page, int prize)
		{
			
			String dbURL = "jdbc:mysql://localhost:3306/trainee";
			String username = "root";
			String password = "Stak@1048";
			
			try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
				
				String sql = "INSERT INTO shop (page, prize, tak ) VALUES (?, ?, ?)";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setInt(1, page);
				statement.setInt(2, prize);
				statement.setString(3, tak);
			//	statement.setString(4, email);
				//statement.setInt(5, age);
				
				int rowsInserted = statement.executeUpdate();
				if (rowsInserted > 0) {
					System.out.println("A new user was inserted successfully!");
				}
	
				
			} catch (SQLException ex) {
				
				ex.printStackTrace();
			}		
			
			
			
		}
	public void ubdateData(String tak, int page, int prize)
	{
		
		String dbURL = "jdbc:mysql://localhost:3306/trainee";
		String username = "root";
		String password = "Stak@1048";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "INSERT INTO shop (page, prize, tak ) VALUES (?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, page);
			statement.setInt(2, prize);
			statement.setString(3, tak);
		//	statement.setString(4, email);
			//statement.setInt(5, age);
			
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}

			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
		
		
		
	}

}


