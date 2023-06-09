import java.io.*;
class Fc
{
	public static void main(String args[])
	{
		File oj=new File("/home/dhatchan-03/Desktop/Abdullah/file.txt");
		try{
		if(oj.createNewFile())
		{
			System.out.println("File Created"+oj.getName());
		}
		else
		{
			System.out.println("File Already Exit");
		
		}
		}
		catch(IOException e)
		{
			System.out.println("File is Not Created");
		
		}
	}
}
