package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UpdateHBM {
  public static void main(String s[])
	{
			ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
			EmployeeDAO edao = (EmployeeDAO) objAC.getBean("empdao");
			Employee objE = new Employee();
			/*objE.setEname("namdev falke");
			objE.setEadd("vijay nagar mumbai");
			objE.setSalary(48000);
			objE.setId(2);
			edao.updateEmp(objE);*/
			objE.setId(2);
			//edao.delEmp(objE);
	}
}
