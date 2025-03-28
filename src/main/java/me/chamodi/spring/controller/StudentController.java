package me.chamodi.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.model.student;


@RestController
@RequestMapping("/Stu")
public class StudentController {
	
	student Chamodi = new student("2020ICT65","Chamodi",23,"IT",3.72);
	student Neranjana = new student("2020ICT97","Neranjana",24,"IT",3.40);
	student Piyumal = new student("2020ICT24","Piyumal",26,"IT",2.86);
	
	//student[] students = {Chamodi, Neranjana, Piyumal};
 	private static List<student> students = new ArrayList<student>();

	public StudentController(){
		students.add(Chamodi);
		students.add(Neranjana);
		students.add(Piyumal);
	}

	@GetMapping("/Chamodi")
	public student Chamodi() {
		return Chamodi;
	}
	// @GetMapping("/Students")
	// public student[] Students() {
	// 	return students;
	// }
	@GetMapping("/students")
	public List<student> getsStudents() {
		return students;
	}
	
	@GetMapping("/students/{id}")
	public student getById(@PathVariable("id") String regno) {
		for(student student: students){
			if(student.getRegNo().equals(regno)){
				return student;
			}
		}
		return null;
	}
	
}