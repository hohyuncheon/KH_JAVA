package com.oop.student.run;

import com.oop.student.controller.StudentManger;


//알듯말듯 다시풀자

public class Run {

	public static void main(String[] args) {
		StudentManger sm = new StudentManger();
		
		sm.insertStudentData();
		sm.printStudentData();
	}

}
