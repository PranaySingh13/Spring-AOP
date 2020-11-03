package com.gk.service;

import com.gk.dto.Show;

public class ShowServiceImpl implements ShowService {

	@Override
	public String runShow(Show show) throws RuntimeException {
		System.out.println("Show " + show.getName() + " Start...");
		System.out.println("Show " + show.getName() + " is Running Successfully");
		if (!show.getName().equalsIgnoreCase("Mimicry")) {
			throw new RuntimeException();
		}
		System.out.println("Show " + show.getName() + " End...");
		return "success";
	}

}
