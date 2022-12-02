package com.mypack.conyroller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DateController {

	@RequestMapping(value = "/date")
	public String dateDisplay(Model model) {
		
		model.addAttribute("dateMsg", "Today's Date:: "+new Date());
		String s=null;
		s.length();
		return "date";
	}
}
