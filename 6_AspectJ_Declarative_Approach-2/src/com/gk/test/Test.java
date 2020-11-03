package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.dto.Show;
import com.gk.service.ShowService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Show show = (Show) context.getBean("showBean");
		ShowService showService = (ShowService) context.getBean("showService");
		try {
			showService.runShow(show);
		} catch (RuntimeException e) {

		}
	}

}
