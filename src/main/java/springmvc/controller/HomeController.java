package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("/help")
	public ModelAndView help() {

//		Creating model and View Object
		ModelAndView modelAndView = new ModelAndView();

//		Setting the Data
		modelAndView.addObject("name", "Prawal");

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		
		
		List<String> lang = new ArrayList<String>();
		lang.add("english");
		lang.add("hindi");
		lang.add("urdu");
		
		modelAndView.addObject("lang",lang);
//				for ( String l : lang) {
//					System.out.println(l);
//				}
//		setting the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}
}
