package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoHBM {
	public static void main(String s[])
	{
			ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
			EmployeeDAO edao = (EmployeeDAO) objAC.getBean("empdao");
			Employee objE = new Employee();
			objE.setEname("anil gupta");
			objE.setEadd("mig colony surat");
			objE.setSalary(40000);
			edao.saveEmp(objE);
	}
}
