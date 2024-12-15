package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processForm(
			@RequestParam(name ="email" , required=true)String email, 
			@RequestParam(name = "name" , required=true)String name, 
			@RequestParam(name ="password", required = false)String password, Model model) {

		System.out.println(email);

		System.out.println(name);

		System.out.println(password);
		
		model.addAttribute("email", email);
		model.addAttribute("name", name);
		model.addAttribute("password",password);
		
		
		return "success";
	}
}
