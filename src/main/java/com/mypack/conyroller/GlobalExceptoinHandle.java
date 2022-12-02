package com.mypack.conyroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class GlobalExceptoinHandle {
	
	@ExceptionHandler(value= NullPointerException.class)
	public String handleNullPointerException(Model model) {
		
		model.addAttribute("errorMsg", "Some Problem Occured Plese Try After Some Time ...");
		return "gerror";
	}

}
