package com.sycamore.MainController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	 @ResponseBody
	 @RequestMapping("/greeting")
	 public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
       return "Working";
    }
	
}
