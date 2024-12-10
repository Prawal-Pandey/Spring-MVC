package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// Handle /home request
	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home url");
		return "index"; // This will map to /WEB-INF/views/index.jsp
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about jsp");
		return "about";
	}
}
