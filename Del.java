import java.util.*;
import java.sql.*;
class Del
{
	public static void main(String args[])
	{
		Scanner oj=new Scanner(System.in);
		System.out.println("Delete Process");
		System.out.println("Enter ROLLNUMBER to Delete a Student ");
		int num=oj.nextInt();
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/VA","root","Root1_root");
			Statement st=con.createStatement();
			int result=st.executeUpdate("Delete from Student Where RollNO="+num+";");
			if(result>0)
			{
				System.out.println("SUCESSFULLY DELETED");
			}
			else
			{
				System.out.println("INVALID ROLLNUMBER");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}
}
