import java.io.*;
class Fr
{
	public static void main(String args[])
	{
		String name="";
		try{
		FileReader oj=new FileReader("file.txt");
		int n=oj.read();
		System.out.println(n);
		while(n!=-1)
		{
			System.out.print((char)n);
			name=name+(char)n;
			System.out.println(name);
			n=oj.read();
			//System.out.println(n);
		}
		String val=name.replace("blue","brown");
		System.out.println(val);
		}
		catch(IOException e)
		{
			System.out.println("Error Occure");
		
		}
		
	}
}
