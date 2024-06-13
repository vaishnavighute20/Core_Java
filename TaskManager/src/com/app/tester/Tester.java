package com.app.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Task;
import com.app.utils.TaskManagerValidations;
import static com.app.utils.TaskManagerUtils.*;
public class Tester {
/*
	a. Add New Task                       
	b. Delete a task                         
	c. Update task status               
	d. Display all pending tasks     
	e. Display all pending tasks for today           
	f.  Display all tasks sorted by taskDate  
	*/
	public static void main(String[] args) {
      List<Task> tasklist=new ArrayList<>();
		
      try(Scanner sc=new Scanner (System.in)){
    	  boolean exit=false;
    	  
    	  
    	 try {
    		
    		 while(!exit) {
       		  System.out.println("Options:  "
       		  		+ "\r\n"
       		  		+ "	1. Add New Task \n"
       		  		+ "	2. Delete a task \n"
       		  		+ "	3. Update task status \n"
       		  		+ "	4. Display all pending tasks \n"
       		  		+ "	5. Display all pending tasks for today \n"
       		  		+ "	6.  Display all tasks sorted by taskDate\n"
       		  		+ "7.Display task");
       	
    		 switch (sc.nextInt()) {
			case 1:
				System.out.println("Add New Task");
				System.out.println("enter  taskname, description,taskDate,Status,active");
				Task t=addTask(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextBoolean(),
						tasklist);
				if(tasklist.add(t))
				{
					System.out.println(t);
					System.out.println("task added successfully");
				}
				
				break;
				
            case 2:
            	
				System.out.println("Delete a task");
				System.out.println("enter id");
            	String mesg=removeTask(sc.nextInt(), tasklist);
            	System.out.println(mesg);
				break;
				
            case 3:
            	System.out.println("enter id and status");
            	String m=updateTask(sc.nextInt(),sc.next());
				System.out.println("Update task status");
				System.out.println(m);

				break;
				
            case 4:
            	
				System.out.println("Display all pending tasks");
                  pendingTask(tasklist);
            	break;
            	
            	 
            case 5:
            	
				System.out.println("Display all pending tasks for today");
				pendingTask(tasklist);

            	break;
            	
            	
            case 6:
            	Collections.sort(tasklist,new sortedTask());
            	
				System.out.println("Display all tasks sorted by taskDate  ");
                 for (Task t1:tasklist) {
                	 System.out.println(t1);
                 }
            	
            	break;

            case 7:
            	System.out.println("The details of task is : ");
            	for(Task t1: tasklist)
            	{
            		System.out.println(t1);
            	}
            	break;
			default: System.out.println("thanku visit again ");
			       exit=true;
				
			}
    		 
    		 
    		 }
    		 
    		 
    		 
    	 }catch(Exception e){
    		 System.out.println(e);
    		 
    	 }
      }
	}

}
