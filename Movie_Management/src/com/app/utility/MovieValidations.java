package com.app.utility;

import java.text.ParsePosition;
import java.time.LocalDate;
import java.util.List;

import com.app.core.Movie;
import com.app.core.MovieType;
import com.app.exception.MovieException;

public class MovieValidations {
	
	

	private static boolean isMovieTypeIsAvailable(MovieType mt) {
		for(MovieType mvt :MovieType.values()) {
			if(mvt.equals(mt)) {
				return true;
			}
 		}
		return false;
		
 		
	}

	private static boolean isMovieNameIsDuplicate(String name,List<Movie>mlist) {
 		boolean flag=false;
 		for(Movie m:mlist) {
 			if(m.getMoviename().equals(name)) {
 				return true;
 			}
 		}
		return false;
	}

	private static void checkMovieDate(LocalDate date) throws MovieException {
 		if(date.isBefore(LocalDate.now())) {
 			throw new MovieException("release date should be future date");
 		}
	}

	private static void validateMovieId(String id) throws MovieException {
 		if(id.length()<8) {
 			throw new MovieException("movie length should be 8 char");
 			
 		}
	}

	 
public static Movie validateAllInputs(String movieid, String moviename, String date, int ratings, boolean incinemas, String movieType ,List<Movie>mlist) throws MovieException{
		
	 
		
		validateMovieId(movieid);
		LocalDate ldate=LocalDate.parse(date);
		checkMovieDate(ldate);
		isMovieNameIsDuplicate(moviename,mlist);
		MovieType mvt=MovieType.valueOf(movieType.toUpperCase());
		isMovieTypeIsAvailable(mvt);
		//String movieid, String moviename, LocalDate date, int ratings, boolean incinemas, MovieType movieType)
		
		 return new Movie(movieid,moviename,ldate,ratings, incinemas,mvt );
		
		
	}	
	

}
