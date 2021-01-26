package com.oop.movie.model;

import java.util.Arrays;
import java.util.Calendar;

public class Movie {
	private String movieTitle;      	//영화제목
    private String director;        		//감독이름
    private  String[] casting;     		//출연배우 최대5명까지
    Calendar release;						//개봉일
    
    public Movie() {}
    
    public Movie(String movieTitle) {
		this.movieTitle = movieTitle;
    }
    
    public Movie(String movieTitle, String director) {
    	this(movieTitle);
		this.director = director;
    }
    
    public Movie(String movieTitle, String director, String[] casting) {
    	this(movieTitle, director);
		this.casting = casting;
    }
    
    public Movie(String movieTitle, String director, String[] casting, Calendar release) {
    	this(movieTitle, director, casting);
		this.release = release;
	}
    
  
	public String information() {
		String s = "[movieTitle=" + movieTitle + ", director=" + director + ", casting=" + Arrays.toString(casting)
				+ ", release=";
		if(release != null) 
			s += release.get(Calendar.YEAR)+"/"+(release.get(Calendar.MONTH)+1)+"/"+release.get(Calendar.DAY_OF_MONTH) + "]";
		else 
			s += null + "]";
		
		return s;
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

	public Calendar getRelease() {
		return release;
	}

	public void setRelease(Calendar release) {
		this.release = release;
	}								
    
    
}
