package me.chamodi.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")

public class StudentController {
	@GetMapping("/name")
	public String stuName() {
		return "Chamodi Indrejith";
	}
	@GetMapping("/regno")
	public String regNumber() {
		return "2020ICT65";
	}
}
