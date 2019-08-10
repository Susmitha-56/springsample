package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {
	@RequestMapping("/xyz")
	@ResponseBody
	public String abc()
	{
		//System.out.println("some request has come");
		return "<h1>Welcome baby<h1>";
	}
	@RequestMapping("/read")
	public String mypage()
	{
		return "welcome.html";
	}
	@RequestMapping("/")
	public String login()
	{
		return "login";
	}
	@GetMapping
	@RequestMapping("/welcome")
	@ResponseBody
	//(@RequestParam("uname") String user, @RequestParam("upwd") String password 
	public String loginprocess(String uname,String upwd)
	{
		System.out.println("username"+uname);
		System.out.println("password"+upwd);
		return "<h1>Welcome  "+uname+"</h1>";
	}
	/*@PostMapping
	@RequestMapping("/welcome")
	@ResponseBody
	//(@RequestParam("uname") String user, @RequestParam("upwd") String password 
	public String loginprocesspost(String uname,String upwd)
	{
		System.out.println("username"+uname);
		System.out.println("password"+upwd);
		return "<h1>Welcome  "+uname+"<hr> using post method"+"</h1>";
	}
	*/
	@RequestMapping("/welcome2")
	public String loginprocess2(HttpServletRequest req)
	{
		String user=req.getParameter("uname");
		String password=req.getParameter("unpwd");
		
		HttpSession session=req.getSession();
		session.setAttribute("username", user);
		System.out.println("username"+user);
		System.out.println("password"+password);
		return "welcome";
	}
	@RequestMapping("/welcome3")
	public ModelAndView loginprocess3(User user)
	{
		
		//System.out.println("username"+user.getUname());
		//System.out.println("password"+user.getUpwd());
		
		ModelAndView mv=new ModelAndView();
		mv.addObject(user);
		if(user.getUname().equals(user.getUpwd()))
			mv.setViewName("welcome");
		else
			mv.setViewName("invalid");
		
		return mv;
	}
}
//if all ur jsp files are in seperate folder mention only name like login and in properties mention //spring.mvc.view.prefix=/view/...............spring.mvc.view.suffix=.jsp