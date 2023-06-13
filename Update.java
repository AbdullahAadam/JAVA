import java.sql.*;
import java.util.*;
class Update
{
	public static void main(String args[])
	{
		Scanner oj=new Scanner(System.in);
		boolean rcheck=false;
		System.out.println("UPDATE PROCESS");
		System.out.println("Enter name to Update");
		String name=oj.nextLine();
		//oj.next();
		System.out.println("Enter rollNumber to update");
		int num=oj.nextInt();
		try{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/VA","root","Root1_root");
			Statement st=con.createStatement();
			ResultSet check=st.executeQuery("Select * from Student Where RollNO="+num+";");
			while(check.next())
			{
				rcheck=true;
				System.out.println(check.getInt(1)+" "+check.getString(2)+" "+check.getInt(3));
			}
			if(!rcheck)
			{
				System.out.println("INVALID ROLLNUMBER");
			}
			else
			{
				int rest=st.executeUpdate("Update Student Set Name='"+name+"'Where RollNO="+num+";");
				System.out.println(rest);
			
			
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}
}
