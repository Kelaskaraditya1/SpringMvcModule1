package controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import keys.Keys;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String homePage() {
		System.out.println("This is Index.jsp Page");
		return "index";
	}
	
	@RequestMapping("/about")
	public String aboutPage(Model model) {
		model.addAttribute("StudentId","2021FHCO042");
		model.addAttribute("StudentName","Aditya Kelaskar");
		model.addAttribute("StudentDepartment","Computer Science");
		List<String> expertiseList = List.of("Android DEvlopment","Spring Framework","Spring-Boot Framework","Hibernate framework","Java","Java-8/Functional Programming","Advance-Java");
		model.addAttribute("ExpertiesList",expertiseList);
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView helpPage() {
		ModelAndView modelAndView = new ModelAndView();
		
		// Adding Object or values.
		
		modelAndView.addObject("sid","2021FHCO042");
		modelAndView.addObject("name","Aditya Kelaskar");
		modelAndView.addObject("rollNo",54);
		modelAndView.addObject("department","Computer Science");
		List<String> expertiseList = List.of("Android DEvlopment","Spring Framework","Spring-Boot Framework","Hibernate framework","Java","Java-8/Functional Programming","Advance-Java");
		modelAndView.addObject("expertiseList",expertiseList);
		
		// tagging to page 
		
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
