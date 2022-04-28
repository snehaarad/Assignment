//whos name is start with a
package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class startingwitha {
	public static void main(String[] args) {
		
		ArrayList<String>name=new ArrayList<String>();
		name.add("asawari");
		name.add("sneha");
		name.add("Asawari");
		name.add("pooja");
		name.add("Arpita");
		List<String>list=name.stream().filter(x->x.startsWith("a")||x.startsWith("A")).collect(Collectors.toList());
	System.out.println(list);
	}
	

}
