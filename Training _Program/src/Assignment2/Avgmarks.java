////Avg of Student
package Assignment2;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Avgmarks {

	String name;
	int marks;
	public Avgmarks(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	 public static void main(String[] args) {
		
		 List<Avgmarks>list=new ArrayList<Avgmarks>();
		 list.add(new Avgmarks("sneha",80));
		 list.add(new Avgmarks("neha",90));
		 list.add(new Avgmarks("pallavi",75));
		 list.add(new Avgmarks("pooja",85));
		 double avg=list.stream().collect(Collectors.averagingDouble(stud->stud.marks));
		 System.out.println("Avarage:"+avg);
	}
}
