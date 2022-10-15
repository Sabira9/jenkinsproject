package com.example.demo;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDAO dao;

@RequestMapping("/")
public ModelAndView intializerpage(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("index.jsp");
	return mv;
}

@RequestMapping("/insert")
	public ModelAndView insert(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpname(request.getParameter("empname"));
		e.setPhono(request.getParameter("empphono"));
		e.setAge(Integer.parseInt(request.getParameter("empage")));
		Employee ep=dao.insert(e);
		if(ep!=null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}
	

@RequestMapping("/getall")
public ModelAndView retrieve(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	List<Employee> list=dao.getall();
	mv.setViewName("displayresu.jsp");
	mv.addObject("list",list);
	return mv;
}
@RequestMapping("/delete")
public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Employee e=new Employee();
	int id=Integer.parseInt(request.getParameter("empno"));
	dao.delete(id);
	mv.setViewName("display.jsp");
	return mv;
}
@RequestMapping("/edit")
public ModelAndView Update(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Employee e=new Employee();
	e.setEmpno(Integer.parseInt(request.getParameter("empno")));
	e.setEmpname(request.getParameter("empname"));
	Employee ep=dao.updateByName(e);
	if(ep!=null) {
		mv.setViewName("display.jsp");
	}
	return mv;
}
@RequestMapping("/fetchbyid")
public ModelAndView fetch(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Employee e=new Employee();
	int id=Integer.parseInt(request.getParameter("empno"));
      Employee list=dao.getbyid(id);
	mv.setViewName("Fetchresult.jsp");
	mv.addObject("list",list);
	return mv;
}	
}
