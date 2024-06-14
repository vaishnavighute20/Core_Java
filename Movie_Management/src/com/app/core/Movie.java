package com.app.core;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {
	
  private String movieid;
  private String moviename;
  private LocalDate date;
  private int ratings;
  private boolean incinemas;
  private MovieType movieType;
  
  
  
    public Movie(String movieid, String moviename, LocalDate date, int ratings, boolean incinemas, MovieType movieType) {
	super();
	this.movieid = movieid;
	this.moviename = moviename;
	this.date = date;
	this.ratings = ratings;
	this.incinemas = incinemas;
	this.movieType = movieType;
}



	public String getMovieid() {
		return movieid;
	}



	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}



	public String getMoviename() {
		return moviename;
	}



	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}



	public LocalDate getdate() {
		return date;
	}



	public void setdate(LocalDate date) {
		this.date = date;
	}



	public int getRatings() {
		return ratings;
	}



	public void setRatings(int ratings) {
		this.ratings = ratings;
	}



	public boolean isIncinemas() {
		return incinemas;
	}



	public void setIncinemas(boolean incinemas) {
		this.incinemas = incinemas;
	}



	public MovieType getMovieType() {
		return movieType;
	}



	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}



	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", date=" + date + ", ratings=" + ratings
				+ ", incinemas=" + incinemas + ", movieType=" + movieType + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(movieid, other.movieid);
	}
  
    
  
   
}
