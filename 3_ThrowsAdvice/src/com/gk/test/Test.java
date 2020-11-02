package com.gk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gk.dto.Movie;
import com.gk.service.MovieService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		Movie movie = (Movie) context.getBean("movieBean");
		MovieService movie_serv = (MovieService) context.getBean("movieProxy");
		try {
			movie_serv.playMovie(movie);
		} catch (Exception e) {
		}
	
	}
}
