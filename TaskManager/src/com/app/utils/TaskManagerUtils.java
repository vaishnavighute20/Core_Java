package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.app.core.Status;
import com.app.core.Task;
import com.app.exception.TaskManagerException;

import static com.app.utils.TaskManagerValidations.*;
;public class TaskManagerUtils {

	//taskname, description,taskDate,Status
	public static Task addTask(String taskname,String description,String taskdate,String status,boolean active,List<Task> tlist)
	{
		LocalDate date=dateParsing(taskdate);
		Status s=enumParsing(status);
		 return new Task(taskname,description,date,s,active);
	}
	
	// add a method to delete task
	public static String removeTask(int id,List<Task> tasklist) {
		Iterator<Task>itr=tasklist.iterator();
		while(itr.hasNext()) {
			Task t = itr.next();
			if(t.getTaskId()==id) {
				itr.remove();
			}
			
		}
		
		return "task removed successfully";
		
	}
	
	//add a method to update a list
	public static String updateTask(int id,String Status) throws TaskManagerException {
		Status s=enumParsing(Status);
		Task t=new Task(id);
		t.setStatus(s);
		return " status is updated successfully";
		
	}
	
	// add a method  to display all pending task
	public static void pendingTask(List<Task>tasklist) {
		for (Task t:tasklist) {
			if(t.isActive()&&t.getStatus()==Status.PENDING) {
			 
				System.out.println(t);
			}
			
		}
	}
	
	
	// add a method to display pending task of today
	public static void pendingTaskToday(List<Task>Tasklist) {
		for(Task t:Tasklist) {
			if(t.getStatus()==Status.PENDING  && t.getTaskDate().equals(LocalDate.now())) {
				System.out.println(t);
			}
			
		}
	}
}
