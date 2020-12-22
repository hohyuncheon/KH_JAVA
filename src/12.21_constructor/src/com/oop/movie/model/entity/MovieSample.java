package com.oop.movie.model.entity;

import java.util.Arrays;
import java.util.Calendar;

public class MovieSample {
	
	private String movieTitle = " ";
	private String director = " ";
	private String [] casting = new String [5];
	private Calendar relese = null;
	
	
	
	
	public MovieSample (String movieTitle) {
		this.movieTitle = movieTitle;
	}
		
	public MovieSample (String movieTitle, String director) {
		this(movieTitle);
		this.director = director;
		
	}
	public MovieSample (String movieTitle, String director, String [] casting) {
		this(movieTitle, director);
		this.casting=casting;
	}
	public MovieSample (String movieTitle, String director, String [] casting, Calendar relese) {
		this(movieTitle, director, casting);
		this.relese = relese;

	}


	public String getMovieTitle() {
		return movieTitle;
	}


	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String[] getCasting() {
		return casting;
	}


	public void setCasting(String[] casting) {
		this.casting = casting;
	}


	public Calendar getRelese() {
		return relese;
	}


	public void setRelese(Calendar relese) {
		this.relese = relese;
	}
	
	public void printinfo(){
		
			String temp3="";
			if(getCasting()!= null)
				temp3= Arrays.toString(getCasting());
			
			
			String temp="";
			if(getRelese()!=null )
				temp += getRelese().get(Calendar.YEAR)+"년 "+getRelese().get(Calendar.MONTH)+"월 "+
						getRelese().get(Calendar.DAY_OF_MONTH)+"일";
			
			System.out.print("영화제목"+movieTitle+
				"\n감독이름"+ director+
				"\n출연배우 최대"+ temp3 +
				"\n개봉일 "+temp );
		
		
	}
}
