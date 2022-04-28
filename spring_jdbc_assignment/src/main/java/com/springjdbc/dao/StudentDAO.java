package com.springjdbc.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import com.springjdbc.model.*;
public class StudentDAO {

	JdbcTemplate objJDBC;

	public JdbcTemplate getObjJDBC() {
		return objJDBC;
	}

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
	public int saveStudent(Student objE)
	{
		String query ="insert into student (firstname,lastname,fathername,mothername,classname,section,dob,date_of_admission,gender,add1,add2,s_phone,p_phone,p_email,cityid)"
				+ " values ('"+objE.getFirstname()+"','"+objE.getLastname()+"','"+objE.getFathername()+"','"+objE.getMothername()+"','"+objE.getClassname()+"','"+objE.getSection()+"','"+objE.getDob()+"','"+objE.getDate_of_admission()+"','"+objE.getGender()+"','"+objE.getAdd1()+"','"+objE.getAdd2()+"','"+objE.getS_phone()+"','"+objE.getP_phone()+"','"+objE.getP_email()+"',"+objE.getCityid()+")";
		int no;
		no = objJDBC.update(query);
		return no;
	}

	
	
	
	
}
