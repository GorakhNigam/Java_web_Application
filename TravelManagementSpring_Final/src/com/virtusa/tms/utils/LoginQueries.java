package com.virtusa.tms.utils;

public class LoginQueries {
	public static String pass = "select password,role from EmployeeLogin where username=?";
	public static String allEmp = "select * from Employee0 where emailId=?";
}
