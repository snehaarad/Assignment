package com.yash.sb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.yash.sb.model.*;
import com.yash.sb.dao.*;
@Controller
public class SBController {
	 
	 @Autowired
	 UserDAO objudao;
	 
	 @Autowired
	 CityDAO cityobj;
	 
	@RequestMapping("/")
	public String index()
	{
		//System.out.println("hello how are you ");
		return "index";
	}
	@RequestMapping("/login")
	public String m1()
	{
		return "login";
	}
	@RequestMapping("/signup")
	public String m2()
	{
		return "signup";
	}
	@RequestMapping(value="/saveuser", method=RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User objuser)
	{
		ModelAndView objmv = new ModelAndView();
		 
		if(objudao.addUser(objuser)==1)
		{
			 
			objmv.setViewName("usersuccess");
			objmv.addObject("user",objuser);	
		
		return objmv;
		}
		else
		{
			objmv.setViewName("signup");
			return objmv;
		}
	}
	
	@RequestMapping(value="/showalluser")
	public ModelAndView userlist()
	{
		List<User> ulist=objudao.getAllUser();
		List<City> clist = cityobj.getAllCity();
 		ModelAndView objmv = new ModelAndView();
 		
		objmv.addObject("ulist",ulist);
		objmv.addObject("citylist",clist);
		
		objmv.setViewName("userlist");
		return objmv;
	}
}

