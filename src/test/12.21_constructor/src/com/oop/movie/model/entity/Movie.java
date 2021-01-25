package com.oop.movie.model.entity;

import java.util.Calendar;

public class Movie {

	

	public static void main(String[] args) {
		
		
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.YEAR, 2020);
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DAY_OF_MONTH, 22);
		
		MovieSample ms = new MovieSample(" 거북이달린다", "봉준호", new String[]{"원빈", "장동건"} , ca);
		ms.printinfo();
		
		
		
		
	}

}
