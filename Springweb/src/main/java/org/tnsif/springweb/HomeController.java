package org.tnsif.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
     public String home() {
    	 System.out.print("code to demonstrate on simple "+"web appliaction" );
    	 return "Home.jsp";
     }
}
