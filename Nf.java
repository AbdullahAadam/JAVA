import java.util.Scanner;
import java.io.*;
class Nf
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your File name to Create");
		String n=s.nextLine();
		String f=n+".txt";
		System.out.println(f);
		try{
			File oj=new File(f);
			if(oj.createNewFile())
			{
				System.out.println("File is created"+oj.getName());
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
		//System.out.println("1. To Read");
		System.out.println("To Write");
		try
		{
			FileWriter fw=new FileWriter(f);
			fw.write("Hello World");
			fw.append("\nBy Kai");
			System.out.print("Sucessfully Worte");
			fw.close();
		}
		catch(IOException e)
		{
		
			System.out.println("Error in Write");
		}
		System.out.println("To Read");
		try
		{
			FileReader fr=new FileReader(f);	 
			int d=fr.read();
			while(d!=-1)
			{
				System.out.println((char)d);
				d=fr.read();
			
			}		
		}
		catch(IOException e)
		{
			System.out.println("Error in Write");
		}
	}
}
