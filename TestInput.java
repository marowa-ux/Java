import java.lang.*;
import java.util.Scanner;


public class TestInput
{

public static String input()
{
String str;
Scanner in = new Scanner(System.in);
 
     //Get input String
     System.out.print("Enter : ");
     str = in.nextLine();
	 return str;
}
	 
	 public static void main(String args[])
	 {
		 String a;
		a=input();
		
		 System.out.println("\nYou Enterd :"+a);
	 }
	 
	 
}