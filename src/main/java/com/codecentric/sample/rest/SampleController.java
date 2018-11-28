package com.codecentric.sample.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codecentric.sample.store.model.Customer;

@RestController
@RequestMapping("/sample")
public class SampleController {

	 @RequestMapping(value="/hello",method = RequestMethod.GET)
	    public Customer greeting() {
	        return new Customer("1", "Test", "Test");
	    }
}
