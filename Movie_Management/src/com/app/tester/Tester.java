package com.app.tester;
import static com.app.utility.MovieUtils.*;
import static com.app.utility.MovieValidations.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Movie;
import com.app.core.MovieType;

public class Tester {

	public static void main(String[] args) {
    
		List<Movie>mlist=new ArrayList<Movie>();
		
//	    String Movie_ID;
//		String Movie_name;
//		LocalDate date;
//		int ratings;
//		boolean InCinemas;
//		MovieType movieType;
		
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		while(!exit) {
			System.out.println("options"
					+ "1. ");
			System.out.println("choose options "
					+ "1. add "
					+ "2. display "
					+ "3.sort movie as per release date "
					+ "4.display by movie  "
					+ "5. update movie by rating  "
					+ "6. remove  movie");
			try {
				switch (sc.nextInt()){
				// add
				case 1 :
					System.out.println("Enter movieid,  moviename,  date,  rating, incinemas,  movieType");
					Movie adddata=validateAllInputs(sc.next(), sc.next(),sc.next(), sc.nextInt(), sc.nextBoolean(), sc.next(), mlist);					
					mlist.add(adddata);
					System.out.println("Data added!");
					
					break;
					
               //display all
				case 2:	
					for(Movie M: mlist) {
					System.out.println(M);
					}
					
					break;
					
					
				case 3://sort movie as per release date
					Collections.sort(mlist, new sortByDate());
             	   for (Movie m:mlist)
             	   {
             		   System.out.println("Date"+m.getdate());
             	   }
            	
					break;
					
					
				case 4:// dispaly by movie type
					
					searchByMovieType(sc.next(),mlist);
                	
					break;
					
					
				case 5:// update movie rating
					 System.out.println("enter movie id and rating ");
 	                 modifyRating(sc.next(), sc.nextInt(), mlist);
					break;
					
					
				case 6://remove movie
					deleteByName(sc.next(),mlist);
                    
					
					
					break;
					
				case 7: // exit
					exit=true;
					System.out.println("exiting");
							

				default:
					break;
				}
			}catch(Exception e) {
				sc.nextLine();
				System.out.println(e);
			}
		}
		
		
	}

	
	

	
}
