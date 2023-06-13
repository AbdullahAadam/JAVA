import java.sql.*;
import java.util.Scanner;
class Show
{
	public static void main(String args[])
	{
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/VA","root","Root1_root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from Student;");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
