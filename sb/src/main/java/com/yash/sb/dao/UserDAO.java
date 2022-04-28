package com.yash.sb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;
import com.yash.sb.model.User;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 @Component
public class UserDAO {
	  @Autowired
	  JdbcTemplate jdbc;
	public int addUser(User objuser)
	{
		if(jdbc!=null)
		{
		int rcount;
		rcount= jdbc.update("insert into user (name,address,email,password) values(?,?,?,?)",objuser.getName(),objuser.getAddress(),objuser.getEmail(),objuser.getPassword());
		return rcount;
		}
		return 0;
	}
	public List<User> getAllUser()
	{
		return jdbc.query("select * from user", new RowMapper<User>() {
			public User mapRow(ResultSet rs,int rowno) throws SQLException
			{
				User obju = new User();
				obju.setUid(rs.getInt("uid"));
				obju.setName(rs.getString("name"));
				obju.setAddress(rs.getString("address"));
				obju.setEmail(rs.getString("email"));
				 
				return obju;
			}
		});		
	}
}
