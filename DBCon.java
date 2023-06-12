import java.sql.*;
import java.util.Scanner;
/*
	Database Name=VA;
	Username=root;
	Password=Root1_root;

*/
class DBCon
{
	public static void main(String args[])
	{
		Scanner oj=new Scanner(System.in);
		try{
			//Class.forName("com.mysql.jdbc.Driver");
			try{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/VA","root","Root1_root");			
				System.out.println("True");
				System.out.println("Enter your Roll number");
				int num=oj.nextInt();
				oj.nextLine();
				System.out.println("Enter your Name ");
				String name=oj.nextLine();
				//oj.nextLine();
				System.out.println("Enter your Age ");
				int age=oj.nextInt();
				Statement st=con.createStatement();
				int rs=st.executeUpdate("Insert into Student(RollNO,Name,Age)values("+num+",'"+name+"',"+age+");");
				System.out.println(rs);
				 //st.executeQuery("Insert into Student(RollNO)values(10);");
				//if(rs)
					//System.out.println("Successfuly Inserted");
				//else
					//System.out.println("Not Inserted");		
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			

	}
}
