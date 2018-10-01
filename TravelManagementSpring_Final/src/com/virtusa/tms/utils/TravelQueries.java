package com.virtusa.tms.utils;

public class TravelQueries {
	public static String addempl = "insert into Employee0 values (?,?,?,?,?,?,?,?,?,?)";
	public static String getAllEmpls = "select * from Employee0 where employeeName=?";
	public static String viewPrevPlan = "select * from Employee0 where employeeName=?";
	public static String everyEmpls = "select * from Employee0";
	public static String updateAll = "update Employee0 set employeeName=?, emailId=?, source=?, destination=? travelPurpose=?, travelMode=?,duration=? where serialNo=?";
	public static String updateStatus = "update Employee0 set status = ? where serialNo=?";
	public static String updateExpense = "update Employee0 set travelExpense = ? where serialNo=?";
}
