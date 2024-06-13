package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Status;
import com.app.core.Task;
import com.app.exception.TaskManagerException;

public class TaskManagerValidations {
 

	public static LocalDate dateParsing(String taskDate) {
		return LocalDate.parse(taskDate);
		
	}
	
	public static Status enumParsing(String enums) {
		return Status.valueOf(enums.toUpperCase());
		
	}
	public static Status checkactive(String s) throws TaskManagerException {
		Status s1=enumParsing(s);
		if(Status.PENDING==s1) {
			return s1;
		}
		throw new TaskManagerException("invalid status");
	}
}
