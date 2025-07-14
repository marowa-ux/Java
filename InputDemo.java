import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class InputDemo
{
	public static void main(String args[])
	throws Exception
	{
		Scanner sc= new Scanner(System.in);
		
		InputStreamReader isr= new InputStreamReader(System.in);
		
		BufferedReader bfrdr =new BufferedReader(isr);
		
		String s1,s2,s3;
		int i;
		double d;
		char c;
		/*
		System.out.print("String 1 :");
		s1=sc.next();
		
		System.out.print("String 2 :");
		s2=sc.nextLine();
		
		System.out.println("your 1st String :"+s1);
		System.out.println("your 2nd String :"+s2);
		
		*/
		System.out.print("String 3 :");
		s3= bfrdr.readLine();
		
		System.out.print("Integer :");
		i=sc.nextInt();
		
		System.out.print("Double :");
		d=sc.nextDouble();
		System.out.print("Character :");
		c=sc.next().charAt(0);
		
		
		
		System.out.println("Integer value You entered :"+i);
		System.out.println("Double value You enetered :"+d);
		System.out.println("Character value you enterd:"+c);
		
		System.out.println("your 3rd String :"+s3);
		
		/*
		public static String StrInput()
{
String str;
Scanner in = new Scanner(System.in);
 
     
     System.out.print("Enter : ");
     str = in.nextLine();
	 return str;
}
		*/
	}
}