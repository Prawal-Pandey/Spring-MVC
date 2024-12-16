package springmvc.controller;

import springmvc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;

@Controller
public class ContactController {

	@Autowired
	private UserService UserService;

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
		int createdUser = this.UserService.createUser(user);
		model.addAttribute("msg", "User Created with ID" + createdUser);
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
