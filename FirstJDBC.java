import java.sql.*;
class FirstJDBC
{
	public static void main(String args[])
	{
		try
		{
			// load the Driver
			class.forName("com.mysql.jdbc.Driver");

			//Creating  a Connection
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="Jitu@123";
			Connection con=DriverManager.getConnection();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}