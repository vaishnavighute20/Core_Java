package com.app.core;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
	
/*You can create a class Task with fields like taskId, taskName, description, taskDate, status, active.
taskId should be unique and generated automatically.
status should be either PENDING, IN PROGRESS or COMPLETED.
active should be either true or false. Deleted task will have active=false
Newly added task should have default status as PENDING and active=true 	
 */
	private int taskId;
    private String taskname;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	private static int counter=1;
	
	// param ctor
	public Task(int taskId, String taskname, String description, LocalDate taskDate, Status status, boolean active) {
		super();
		this.taskId = taskId;
		this.taskname = taskname;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}
	public Task(String taskname2, String description2, LocalDate taskDate2, Status status2,boolean active2) {
		taskId=counter++;
		this.taskname = taskname2;
		this.description = description2;
		this.taskDate = taskDate2;
		this.status = status2;
		this.active=active2;
 	}
	
	public Task(int id) {
		this.taskId=id;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskname=" + taskname + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(taskId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
	 if(!(obj instanceof Task))return false;
		 
		Task other = (Task) obj;
		return taskId == other.taskId;
	}
	
	
	
	
	

}
