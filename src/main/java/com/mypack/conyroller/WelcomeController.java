package com.mypack.conyroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping(value = "/welcome")
	public String Welcome(Model model) {
		
		model.addAttribute("msg", "Welcome to Ashok It School...");
		String name=null;
		name.length();
		return "greet";
	}
	
	/*Controller Based Exception Handler....
	 * 
	 * @ExceptionHandler(value = NullPointerException.class) public String
	 * handleNullValueException(Model model) {
	 * 
	 * model.addAttribute(
	 * "errorMsg","Somthing went roung..."); return
	 * "error"; }
	 */

}
