package com.sit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.model.Student;

//@Controller
//@ResponseBody
@RestController
public class StudentController {

	@RequestMapping("/")
	public String preLogin()
	{
		return "Welcome Skills IT Academy....!";
	}
	
	@RequestMapping(path = "/login" ,method = RequestMethod.GET)
	public Student login()
	{
		Student stu = new Student();
				stu.setName("Ak");
				stu.setEmail("ak@gmail.com");
				stu.setAddr("Pune");
				stu.setRollno(101);
		return stu;
	}
	
//	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	@PutMapping("/update")
//	@GetMapping("/get")
//	@DeleteMapping("/delete")
//	@PostMapping("/insertData")
	public void updateData()
	{
		
	}
}
