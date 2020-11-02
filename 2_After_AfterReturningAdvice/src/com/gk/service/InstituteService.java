package com.gk.service;

import com.gk.dto.Student;

public interface InstituteService {

	public void enquiry(Student student,String course_name);
	
	public void registration(Student student,String course_name);
}
