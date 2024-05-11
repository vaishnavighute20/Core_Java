package com.app.tester;

import static com.app.utils.UserUtils.openConnection;

import java.sql.*;

public class TestDBconnection {

	public static void main(String[] args) {
try(//get database connection
		Connection cn=openConnection();
		//create empty statement, to hold SQL
		Statement st = cn.createStatement();
		//execute select query n get Resultset
	ResultSet rst = st.executeQuery("select * from users order by email");
		//ResultSet rst1 = st.executeQuery("select * from users order by email");

		){
		// ResultSet processing
					// cursor --> before the 1st row
		while(rst.next()) {
			/*
			 * id | first_name | last_name | email | password 
				 * | dob | status | role
			 */
			System.out.printf("Id %d Name %s %s Email %s" 
			 +"pwd %s Dob %s Status %b Role %s %n",rst.getInt(1),rst.getString(2),
			 rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),
			 rst.getString(7),rst.getString(8));			
//			System.out.printf("Id %d Name %s %s Email %s" 
//					 +"pwd %s Dob %s Status %b Role %s %n",rst1.getInt(1),rst1.getString(2),
//					 rst1.getString(3),rst1.getString(4),rst1.getString(5),rst1.getString(6),
//					 rst1.getString(7),rst1.getString(8));
//					
				
		}
			
		}//JVM : cn.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	}

