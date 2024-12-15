package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class ContactController {

	@ModelAttribute
	public void commonDataForModel(Model model) {
		model.addAttribute("opera", "Rains");
		model.addAttribute("Hi", "Header");
		model.addAttribute("prawal", " This is Descrption");
		System.out.println("adding common data to model");

	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);

//		model.addAttribute("user",user);
		return "success";

	}

	@RequestMapping("/contact")
	public String showForm(Model model) {
		System.out.println("Creating form");
		return "contact";
	}

//	NEW APPROACH ABOVE
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String processForm(@RequestParam(name = "email", required = true) String email,
//			@RequestParam(name = "name", required = true) String name,
//			@RequestParam(name = "password", required = false) String password, Model model) {
//
//		User user = new User();
//		user.setEmail(email);
//		user.setName(name);
//		user.setPassword(password);
//		System.out.println(user);
////		model.addAttribute("email", email);
////		model.addAttribute("name", name);
////		model.addAttribute("password", password);
//
//
//		model.addAttribute("user", user);
//
//		return "success";
//	}
}
