package com.learn.assignment1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class StudentsInfo {
	String student_Initial,student_ID,student_Name,student_Course_Code,student_gender,student_Info;

	public void StudentsInfo() {
		// TODO Auto-generated constructor stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("********************************************************");
		System.out.println("PROGRAM 1");
		System.out.println("Enter student details using template below");
		System.out.println("Enter - ID,Surname,Initials,CourseCode,Gender");
		System.out.println("SSSSSSSNNNNNNNNIICCCCG");
		System.out.println("ENTER THIS FOR TESTING SIDDARTMANOJREDVR1992M");
		
		student_Info= scanner.nextLine();
		student_ID=student_Info.toString().substring(0,7);
		student_Name=student_Info.toString().substring(7,15);
		student_Initial=student_Info.toString().substring(15,17);
		student_Course_Code=student_Info.toString().substring(17,21);
		student_gender=student_Info.toString().substring(21,22);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("Name is  "+student_Initial+"  "+student_Name);
		System.out.println("Date is  "+new SimpleDateFormat("MM dd yyyy")
				.format(Calendar.getInstance().getTime()));
		//System.out.println( new Date().toString().substring(0, 10) );
		
		Calendar ca1 = Calendar.getInstance();    
		
		int DAY_OF_YEAR=ca1.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("Today is  "+DAY_OF_YEAR+" day of the year");
		System.out.println( "The Time is  "+new SimpleDateFormat("HH:mm")
				.format(Calendar.getInstance().getTime()) );
		System.out.println("********************************************************");
		System.out.println("PROGRAM 2");
	}
	public String getStudent_ID() {
		return student_ID;
	}


	public void setStudent_ID(String student_ID) {
		this.student_ID = student_ID;
	}


	public String getStudent_Initial() {
		return student_Initial;
	}


	public void setStudent_Initial(String student_Initial) {
		this.student_Initial = student_Initial;
	}


	public String getStudent_Name() {
		return student_Name;
	}


	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}


	public String getStudent_Course_Code() {
		return student_Course_Code;
	}


	public void setStudent_Course_Code(String student_Course_Code) {
		this.student_Course_Code = student_Course_Code;
	}


	public String getStudent_gender() {
		return student_gender;
	}


	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}


	public String getStudent_Info() {
		return student_Info;
	}


	public void setStudent_Info(String student_Info) {
		this.student_Info = student_Info;
	}

}
