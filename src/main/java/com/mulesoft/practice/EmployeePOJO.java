package com.mulesoft.practice;

public class EmployeePOJO{
	int empID;
 	String namePrefix;
 	String firstName;
 	String middleInitial;
 	String lastName;
 	String gender;
 	String eMail;
 	
 	public EmployeePOJO()
 	{
 		
 	}
 	
 	public EmployeePOJO(int empID, String namePrefix, String firstName, String middleInitial, String lastName, String gender, String eMail)
 	{
 		this.empID = empID;
 	 	this.namePrefix = namePrefix;
 	 	this.firstName = firstName;
 	 	this.middleInitial = middleInitial;
 	 	this.lastName = lastName;
 	 	this.gender = gender;
 	 	this.eMail = eMail;
 	}
 	
 	public int getEmployeeID()
 	{
 		return empID;
 	}
 	
 	public void setEmployeeID(int empId)
 	{
 		this.empID = empId;
 	}
 	
 	public String getNamePrefix()
 	{
 		return this.namePrefix;
 	}
 	
 	public void setNamePrefix(String namePrefix)
 	{
 		this.namePrefix = namePrefix;
 	}
 	
 	public String getMiddleInitial()
 	{
 		return this.middleInitial;
 	}
 	
 	public void setMiddleInitial(String middleInitial)
 	{
 		this.middleInitial = middleInitial;
 	}
 	
 	public String getFirstName()
 	{
 		return this.firstName;
 	}
 	
 	public void setFirstName(String firstName)
 	{
 		this.firstName = firstName;
 	}
 	
 	public String getLastName()
 	{
 		return this.lastName;
 	}
 	
 	public void setLastName(String lastName)
 	{
 		this.lastName = lastName;
 	}
 	
 	public String getGender()
 	{
 		return this.gender;
 	}
 	
 	public void setGender(String gender)
 	{
 		this.gender = gender;
 	}
 	
 	public String getEMail()
 	{
 		return this.eMail;
 	}
 	
 	public void setEMail(String eMail)
 	{
 		this.eMail = eMail;
 	}
}

