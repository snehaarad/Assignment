package com.yash;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

public class EmployeeDAO {
	HibernateTransactionManager hbmtemplate;

	public void setHbmtemplate(HibernateTransactionManager hbmtemplate) {
		this.hbmtemplate = hbmtemplate;
	}
	public void saveEmp(Employee e)
	{	
		  SessionFactory sf= hbmtemplate.getSessionFactory();
		  Session objSession = sf.openSession();
		  Transaction t = objSession.beginTransaction();
		  
		  objSession.save(e);
		  
		  t.commit();
		  System.out.println("Record saved");
		  objSession.close();		  
	}
	public void updateEmp(Employee e)
	{
		  SessionFactory sf= hbmtemplate.getSessionFactory();
		  Session objSession = sf.openSession();
		  Transaction t = objSession.beginTransaction();
		  objSession.update(e);
		  
		  t.commit();
		 System.out.println("Data updated");
	}
	public void delEmp(Employee e)
	{
		  SessionFactory sf= hbmtemplate.getSessionFactory();
		  Session objSession = sf.openSession();
		  Transaction t = objSession.beginTransaction();
		  objSession.delete(e);
		  t.commit();
		  objSession.close();
		  System.out.println("Data deleted");
		
	}
	public Employee getEmpById(int id)
	{
		SessionFactory sf= hbmtemplate.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		
		Employee objE = (Employee) objSession.get(Employee.class,id);
		return objE;		
	}
	public List<Employee> getAllEmp()
	{
		SessionFactory sf= hbmtemplate.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction t = objSession.beginTransaction();
		List<Employee> emplist = new ArrayList<Employee>();
		Criteria ctr = objSession.createCriteria(Employee.class);
		emplist = ctr.list();
		return emplist;		
	}
}
