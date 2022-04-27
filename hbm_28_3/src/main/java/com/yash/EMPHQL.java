package com.yash;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

public class EMPHQL {
	HibernateTransactionManager hbTransMgr;

	 
	public void setHbTransMgr(HibernateTransactionManager hbTransMgr) {
		this.hbTransMgr = hbTransMgr;
	}


	public void UpdateEmpHQL( )
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("update Employee set eadd=?1 where id=?2");
		//q.setParameter("ea", "ullash nagar mumbai");
		//q.setParameter("i", 4);
		q.setParameter(1, "sudama nagar ujjain");
		q.setParameter(2, 4);
		int status = q.executeUpdate();
		System.out.println(status);
		tx.commit();
	}
	void showAllEmp()
	{
		
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("from Employee");
		List<Employee> emplist=q.getResultList();
		
		for (Employee e: emplist)
		{
		  System.out.println(e.getEname()+"\t"+e.getSalary());			
		}		
	}
	void showEmpByLimit()
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("from Employee");
	 
		q.setFirstResult(3);// as numbering in records start from 0 it will print records from row no 4 
		q.setMaxResults(6);
		List<Employee> emplist=q.getResultList();
		 
		for(Employee e: emplist)
		{
		  System.out.println(e.getEname()+"\t"+e.getSalary());			
		}
	}
	void getMaxSalaryEmp()
	{
		SessionFactory sf = hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q= objSession.createQuery("select max(salary) from Employee");
		/*max->avg
		max->min
		max->count
		max->sum */
		List<Integer> list = q.getResultList();
		System.out.println(list.get(0));
	}
	public void showAllEmpHQL( )
	{
		SessionFactory sf= hbTransMgr.getSessionFactory();
		Session objSession = sf.openSession();
		Transaction tx = objSession.beginTransaction();
		Query q = objSession.createQuery("from Employee where id=?1");
		//q.setParameter("ea", "ullash nagar mumbai");
		//q.setParameter("i", 4);
		q.setParameter(1, "sudama nagar ujjain");
		//q.setParameter(2, 4);
		List list = q.getResultList();
		System.out.println(list);
		tx.commit();
	}
	
}
