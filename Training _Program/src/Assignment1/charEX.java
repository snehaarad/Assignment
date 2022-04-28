//Find character using lambda expression
package Assignment1;
import java.util.*;
interface find
{
	public void search();
}
public class charEX {
	public static void main(String[] args) {
		
		find cf= ()->{
			String str="sneha";
			char ch[]=str.toCharArray();
			int index;
			Scanner sc=new Scanner(System.in);
			System.out.println("index no:");
			index=sc.nextInt();
			System.out.println(ch[index]);
			
			
		};
		cf.search();
		
	}
	 

}
