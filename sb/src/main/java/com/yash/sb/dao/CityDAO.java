package com.yash.sb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.yash.sb.model.City;
import com.yash.sb.model.User;
@Component 
public class CityDAO {
    @Autowired
	JdbcTemplate jdbc;
   
    public List<City> getAllCity()
    {
    	return jdbc.query("select * from city", new RowMapper<City>() {
			public City mapRow(ResultSet rs,int rowno) throws SQLException
			{
				City objc = new City();
				objc.setCityid(rs.getInt("cityid"));
				objc.setCname(rs.getString("cname"));
				return objc;
			}
		});	
    	
    }
    
}
