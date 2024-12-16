package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReControlller {

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("one handler");
		RedirectView rv = new RedirectView();
		rv.setUrl("contact");
		return rv;
	}

	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is second handler");
		return "redirect:/home";
	}
}
