package com.app.core;

import java.time.LocalDate;
import java.util.Objects;

public class Amazon {
	private String name;
    private String emailid;
    private String password;
    private Subcription subcription;
    private double amount;
    private LocalDate creationdate;
	public Amazon(String name, String emailid, String password, Subcription subcription, double amount,
			LocalDate creationdate) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.subcription = subcription;
		this.amount = amount;
		this.creationdate = creationdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Subcription getSubcription() {
		return subcription;
	}
	public void setSubcription(Subcription subcription) {
		this.subcription = subcription;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(LocalDate creationdate) {
		this.creationdate = creationdate;
	}
	@Override
	public String toString() {
		return "Amazon [name=" + name + ", emailid=" + emailid + ", password=" + password + ", subcription="
				+ subcription + ", amount=" + amount + ", creationdate=" + creationdate + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Amazon)
		 {
			return this.emailid.equals(emailid);
 
		 }
		return false;
	}
    
}
