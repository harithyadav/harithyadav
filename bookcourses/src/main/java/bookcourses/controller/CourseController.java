package bookcourses.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	 @RequestMapping("/hello")
	    public String sayHi() {
	    	System.out.print("HELLO");
	    	return "Hello";
	    	
	    }

}
