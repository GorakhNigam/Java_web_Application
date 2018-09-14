package com.virtusa.empls.utils;

public class EmplDBQueries {
	public static String addempl = "insert into employee values(?,?,?,?,?)";
	public static String getAllEmpls = "select * from employee";
	public static String getEmpl = "select * from employee where empcode=?";
	public static String getUpdate = "update employee set salary=? where empcode = ?";
	public static String updateAll = "update employee set salary=?, empname=?, job=?, doj=? where empcode = ?";
	public static String delEmp = "delete from employee where=?";
}
