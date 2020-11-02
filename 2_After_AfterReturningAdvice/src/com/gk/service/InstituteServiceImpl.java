package com.gk.service;

import com.gk.dto.Student;

public class InstituteServiceImpl implements InstituteService {

	@Override
	public void enquiry(Student student, String course_name) {
		System.out.println("Student Enquiry Details");
		System.out.println("-----------------------");
		System.out.println("Student Name: " + student.getStdName());
		System.out.println("Student Qualification: " + student.getStdQualification());
		System.out.println("Student Email Id: " + student.getStdEmail());
		System.out.println("Student Mobile Number: " + student.getStdMobile());
		System.out.println("Enquiry Course Name: " + course_name);
	}

	@Override
	public void registration(Student student, String course_name) {

		System.out.println("Student Course Registration Details");
		System.out.println("-----------------------------------");
		System.out.println("Student Name: " + student.getStdName());
		System.out.println("Student Qualification: " + student.getStdQualification());
		System.out.println("Student Email Id:" + student.getStdEmail());
		System.out.println("Student Mobile Number: " + student.getStdMobile());
		System.out.println("Enquiry Cousrse Name: " + course_name);
	}

}
