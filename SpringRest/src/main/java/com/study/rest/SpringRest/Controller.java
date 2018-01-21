package com.study.rest.SpringRest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value="/" , method=RequestMethod.GET)
	public String helloworld(@RequestParam(value= "name", defaultValue="world") String name) {
		
		return "hello  "    + name;		
	}

   @RequestMapping(value ="/phani", method=RequestMethod.POST)
   public String helloworld2(@RequestBody String name) {
	return "hello " + name;

	
   }
}