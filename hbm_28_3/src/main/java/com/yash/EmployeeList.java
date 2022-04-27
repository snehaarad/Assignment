package com.yash;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeList {
 public static void main(String s[])
 {
	 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
		EmployeeDAO edao = (EmployeeDAO) objAC.getBean("empdao");
		
		//Employee e = edao.getEmpById(5);
		//System.out.println(e.getEname() +"---"+  e.getEadd());
		List<Employee> elist=edao.getAllEmp();
		
		System.out.println("Empid\t Name \t Salary");
		for(Employee e: elist)
		{
			System.out.println(e.getId()+"\t"+e.getEname()+" \t "+e.getSalary());			
		}
 }
}