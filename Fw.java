import java.io.FileWriter;
import java.io.IOException;
class Fw
{
	public static void main(String args[])
	{	
		//FileWriter oj=new FileWriter("file.txt");
		try{
			FileWriter oj=new FileWriter("file.txt");
			oj.write("Hello World\nI\'m Abdullah");
			oj.append("\nwell");
			System.out.println("Successfullly Wrote");
			oj.close();
		}
		catch(IOException e)
		{
			System.out.println("Error Occure");
		
		}
	}
}
