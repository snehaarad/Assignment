package Assignment2;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class City {
	String cityname;
	int citypopulation;
	int area;
	public City(String cityname,int citypopulation,int area)
	{
		this.cityname=cityname;
		this.citypopulation=citypopulation;
		this.area=area;
	}
	public static void main(String[] args) {
		ArrayList<City> c=new ArrayList<City>();
		c.add(new City("latur",20000,15000));
		c.add(new City("mumbai",30000,30000));
		c.add(new City("pune",25000,20000));
		c.add(new City("banglore",10000,25000));
		//Name of the city having highest population
		City obj=c.stream().max((obj1,obj2)-> obj1.citypopulation>obj2.citypopulation ? 1:-1).get();
		System.out.println(obj.cityname);
		//set of city population
		Set<Integer> Set=c.stream().map(e->e.citypopulation).collect(Collectors.toSet());
		System.out.println(Set);
		//name of the city with least area
		City minarea=c.stream().min((obj1,obj2)-> obj1.area>obj2.area ? 1:-1).get();
		System.out.println(minarea.cityname);
}
}
