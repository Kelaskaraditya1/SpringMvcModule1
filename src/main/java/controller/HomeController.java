package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
