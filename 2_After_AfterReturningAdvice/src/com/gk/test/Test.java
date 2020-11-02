package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.dto.Student;
import com.gk.service.InstituteService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Student student = (Student) context.getBean("stdBean");
		InstituteService inst_serv = (InstituteService) context.getBean("stdProxy");
		inst_serv.enquiry(student, "JAVA");
		System.out.println("***");
		inst_serv.registration(student, "JAVA");
	
	}
}
