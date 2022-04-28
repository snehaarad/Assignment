//find the sequence of char
package Assignment1;
import java.util.Scanner;

interface charseq
{
	default void c()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		System.out.println("enter sequence");
		String str1=sc.next();
		if(str.contains(str1)==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
public class charsequence implements charseq{
	public static void main(String[] args) {
		
		charsequence ch=new charsequence();
		ch.c();
	}
}
