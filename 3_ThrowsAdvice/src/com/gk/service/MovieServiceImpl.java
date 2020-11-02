package com.gk.service;

import com.gk.dto.Movie;

public class MovieServiceImpl implements MovieService {

	@Override
	public void playMovie(Movie movie) throws Exception {

		System.out.println("Movie Details");
		System.out.println("-------------");
		System.out.println("Movie Name: " + movie.getMovie_Name());
		System.out.println("Movie Time: " + movie.getShow_Time());
		System.out.println("Price: " + movie.getPrice());
		throw new RuntimeException("Power Failure Raised");
	}

}
