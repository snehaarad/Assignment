package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HQLDemo {
  public static void main(String s[])
  {
	  ApplicationContext ctxobj = new ClassPathXmlApplicationContext("applicationcontext.xml");
	  EMPHQL objEH= (EMPHQL) ctxobj.getBean("emphql");
	 // objEH.UpdateEmpHQL();
	 // objEH.showAllEmp();
	 // objEH.showEmpByLimit();
	 // objEH.getMaxSalaryEmp();
	  objEH.showAllEmpHQL();
	  
  }
}
