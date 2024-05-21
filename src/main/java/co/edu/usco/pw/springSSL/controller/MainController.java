package co.edu.usco.pw.springSSL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ssl")
public class MainController {

	
	@GetMapping("/test")
	public String testSSL() {
		return "PÁGINA CON SSL!!";
	}
	
	
}
