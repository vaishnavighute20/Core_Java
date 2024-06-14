package com.app.utility;

import java.util.Iterator;
import java.util.List;

import com.app.core.Movie;

public class MovieUtils {

	public static void searchByMovieType(String next, List<Movie> mlist) {
		for (Movie m:mlist) {
			if(m.getMovieType().equals(mlist))
			{
				System.out.println(m);
			}
		}
		
	}
	
	public static void deleteByName(String next, List<Movie> mlist) {
		for(Movie m: mlist)
		{
				Iterator<Movie> i =mlist.iterator();
				
				while(i.hasNext())
				{
					Movie m1=i.next();
					if(m1.getMoviename().equalsIgnoreCase(next));
					{
					
					i.remove();
					System.out.println("deleted");
					}
					
				}
		}
	}

	public static void modifyRating(String id, int rating, List<Movie> mlist) {
		for (Movie m:mlist)
		{
			if(m.getMovieid().equals(id))
			{
				m.setRatings(rating);
				System.out.println("Rating updated!");
			}
			else
			{
				System.out.println("failed updated!");
			}
		}
	
		
		 
	}

 		
	}

 


