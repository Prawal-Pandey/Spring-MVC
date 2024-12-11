package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// Handle /home request
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");

		model.addAttribute("name", "Rains");

		List<String> friends = new ArrayList<String>();

		friends.add("Rajesh");
		friends.add("Suresh");
		friends.add("Prawal");

		model.addAttribute("list", friends);

		return "index"; // This will map to /WEB-INF/views/index.jsp
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about jsp");
		return "about";
	}
}
