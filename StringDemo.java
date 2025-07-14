import java.lang.*;

public class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "Java";
		String s2 = "Hello";
		String s3 = "World";
		
		String s4 = new String("Hello");
		String s5 = new String("OOP1");
		String s6 = new String("OOP1");
		
		String s7 = "Hello";
		String s8 = new String("Hello");
		
		String msg1 = 20 + 21 + "Hello";
		String msg2 = 20 + "Hello" + 21;
		String msg3 = "Hello" + 20 + 21;
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
		
		int age = 20;
		String msg = "I am " + age + " years old.";
		System.out.println(msg);
		
		//msg = "I am 20 years old."
		
		/*
		int l = s1.length();
		System.out.println(l);
		*/
		System.out.println(s1.length());
		System.out.println(s4.length());
		System.out.println(msg.length());
		
		String s9 = "";
		System.out.println(s9.length());
		
		String s10 = new String();
		System.out.println(s10.length());
		
		System.out.println(s10.isEmpty());
		System.out.println(s9.isEmpty());
		System.out.println(s1.isEmpty());
		
		/*char c = s3.charAt(2);
		System.out.println(c);*/
		System.out.println(s3.charAt(2));
		
		String text = msg.substring(2,10);
		System.out.println(text);
		
		//System.out.println(msg.substring(2, 10)); //no refernce for the substring
		
		//System.out.println(s2.concat(s1));
		
		s2.concat(s1);
		System.out.println(s2);
		System.out.println(s1);
		
		s3 = s2.concat(s1);
		System.out.println(s3);
		
		System.out.println(s3 + s7);
		
		
		s3.replace('a', 'o');
		System.out.println(s3);
		
		s3 = s3.replace('a', 'o');
		System.out.println(s3);
		
		s3.toUpperCase();
		System.out.println(s3);
		
		s9=s3.toUpperCase();
		System.out.println(s3);
		System.out.println(s9);
		
		if(s2 == s7){System.out.println("1");}
		else{System.out.println("2");}
		
		if(s2.equals(s7)){System.out.println("3");}
		else{System.out.println("4");}
		
		if(s2 == s4){System.out.println("5");}
		else{System.out.println("6");}
		
		if(s2.equals(s4)){System.out.println("7");}
		else{System.out.println("8");}
		
		if(s4 == s8){System.out.println("9");}
		else{System.out.println("10");}
		
		if(s4.equals(s8)){System.out.println("11");}
		else{System.out.println("12");}
	}
}